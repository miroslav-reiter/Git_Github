package Domaca_Uloha03;

/**
 * Trieda je bankový účet
 */

public class SporiaciUcet
{
    private double aktualnyZostatok;
    private int urokovaSadzba;

    public SporiaciUcet(double pociatocnyzostatok, int urokovaSadzba)
    {
        this.aktualnyZostatok = pociatocnyzostatok;
        this.urokovaSadzba = urokovaSadzba;
    }

    public void vloz(double ciastka)
    {
        aktualnyZostatok = aktualnyZostatok + ciastka;
    }

    public void vyber(double ciastka)
    {
        aktualnyZostatok = aktualnyZostatok - ciastka;
    }

    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }

    public void zapisUrok()
    {
        double urok = (this.aktualnyZostatok * this.urokovaSadzba) / 100;
        aktualnyZostatok = aktualnyZostatok + urok;
    }
}

