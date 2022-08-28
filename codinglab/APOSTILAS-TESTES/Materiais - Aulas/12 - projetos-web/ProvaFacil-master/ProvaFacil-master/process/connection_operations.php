<?php

include "../../pattern/database.php";

function DBUpdate($table, array $data, $where = null) {
    foreach ($data as $key => $value) {
        if (is_string($value))
            $fields_values[] = "{$key} = '{$value}'";
        else
            $fields_values[] = "{$key} = {$value}";
    }
    $fields = implode(', ', $fields_values);
    $where = ($where) ? "WHERE {$where}" : null;
    $query = "UPDATE {$table} SET {$fields} {$where}";
    //echo $query;
    return DBExecute($query);
}

function DBRead($table, $params = null, $fields = "*") {
    $query = "SELECT {$fields} FROM {$table} {$params};";
    //echo $query;
    $result = DBExecute($query);
    if (!mysqli_num_rows($result))
        return false;
    else {
        while ($res = mysqli_fetch_assoc($result)) {
            $data[] = $res;
        }
        return $data;
    }
}

function DBReadSql($query) {
    //echo $query;
    $result = DBExecute($query);
    if (!mysqli_num_rows($result))
        return false;
    else {
        while ($res = mysqli_fetch_assoc($result)) {
            $data[] = $res;
        }
        return $data;
    }
}

//executa inser��es, ou atualiza��es na tabela.
function DBExecute($query) {
    $link = DBConnect();
    $result = mysqli_query($link, $query)or die(mysqli_error($link));
    DBClose($link);
    return $result;
}

function DBDelete($table, $condicao) {
    $query = "DELETE FROM {$table} WHERE {$condicao};";
    $result = DBExecute($query);
    return $result;
}

//insere registro, recebe o nome da tabela e os dados em um array
function DBCreate($table, $data) {
    $data = DBEscape($data);
    $fields = implode(",", array_keys($data));
    $values = "'" . implode("', '", $data) . "'";
    $query = "INSERT INTO {$table} ({$fields}) VALUES ($values)";
    return DBExecute($query);
}

//Proteje contra sql injection
function DBEscape($dados) {
    $link = DBConnect();

    if (!is_array($dados)) {
        $dados = mysqli_real_escape_string($link, $dados);
    } else {
        $arr = $dados;
        foreach ($arr as $key => $value) {
            $key = mysqli_real_escape_string($link, $key);
            $value = mysqli_real_escape_string($link, $value);
            $dados[$key] = $value;
        }
    }

    
    
    DBClose($link);
    return $dados;
}
