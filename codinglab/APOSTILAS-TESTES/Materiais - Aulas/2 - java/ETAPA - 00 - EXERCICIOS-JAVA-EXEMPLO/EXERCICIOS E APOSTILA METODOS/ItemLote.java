package Subprogramas_Lista3;

public class ItemLote
{
	public int ladoA;
	public int ladoB;
	public int ladoC;
	public int quant = 0;
	
	public ItemLote()
	{
		ladoA = 0;
		ladoB = 0;
		ladoC = 0;
	}
	
	public ItemLote(int ladoA, int ladoB, int ladoC, int quant)
	{
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.quant = quant;
	}
	
	
}
