var LINK_API = "https://deckofcardsapi.com/api/";

function loadNewGame() {
    const quantidadeJogadas = 1;

    fetch("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=" + quantidadeJogadas, {
            headers: {
                'Accept': 'application/json'
            }
        })
        .then(response => response.json()) //Converting the response to a JSON object
        .then(data => {
            console.log(data);

            const deckid = data.deck_id;

            setNewGame(deckid);

            // cacheta
            loadCardsOfPlayers(deckid, 9);
        })
        .catch(error => console.error(error));
}

function setNewGame(deckid) {
    // Seta o deckid na request
    document.querySelector("#deckid").value = deckid;

    // retorna a jogada atual
    const valor_setado = document.querySelector("#deckid").value;

    console.log("Valor setado:" + valor_setado);
}

function loadCardsOfPlayers(deckid, quantidadeCartas) {
    let link = "https://deckofcardsapi.com/api/deck/" + deckid + "/draw/?count=" + quantidadeCartas;

    fetch(link, {
            headers: {
                'Accept': 'application/json'
            }
        })
        .then(response => response.json()) //Converting the response to a JSON object
        .then(data => {
            console.log("Cartas do jogador");

            console.log(data);

            const cards = data.cards;

            // const cartasRestantes = data.remaining;
            loadCardsOnDisplay(cards);
        })
        .catch(error => console.error(error));
}

// carrega as cartas na tela
function loadCardsOnDisplay(cards) {
    let body = document.querySelector(".containerTable-body");

    let player = document.querySelector("#playerid").value;

    // pega o codigo do jogador atual e soma 1
    const nextPlayer = parseInt(player) + 1;

    // seta o proximo jogador como atual
    document.querySelector("#playerid").value = nextPlayer;

    cards.forEach(function(value, key) {
        console.log("key: " + key);
        console.log("value: " + value);

        const codigo = value.code;
        const image = value.image;

        const image_svg = value.images.svg;
        const image_png = value.images.png;

        const suit = value.suit;
        const valor = value.value;

        let link_card = "<img src=" + image + " title=" + valor + " of " + suit + " alt=" + suit + ">";
        let link_card_svg = "<img src=" + image_svg + " title=" + valor + " of " + suit + " alt=" + suit + ">";
        let link_card_png = "<img src=" + image_png + " title=" + valor + " of " + suit + " alt = " + suit + " > ";

        body.innerHTML += `<tr>
                                <td class="containerTable-lblValue">` + nextPlayer + `</td>
                                <td class="containerTable-lblValue">` + codigo + `</td>
                                <td class="containerTable-lblValue">` + link_card + `</td>
                                <td class="containerTable-lblValue">` + suit + `</td>
                                <td class="containerTable-lblValue">` + valor + `</td>
                                <td class="containerTable-lblValue">` + link_card_svg + `</td>
                                <td class="containerTable-lblValue">` + link_card_png + `</td>
                            </tr>`;

    });
}