/**
 * Repräsentiert ein Photovoltaik-Modul mit seinen technischen Eigenschaften.
 * Speichert Leistung, Spannung und den Namen des Moduls.
 *
 * @author Elvi
 * @version 1.0
 */
public class PVModule {

    /** Name des PV-Moduls (z.B. "SolarMax 300W") */
    private String name;

    /** Nennleistung des Moduls in Watt */
    private double leistungWatt;

    /** Spannung des Moduls in Volt */
    private double spannungVolt;

    /**
     * Erstellt ein neues PV-Modul mit den angegebenen Werten.
     *
     * @param name         Name des Moduls
     * @param leistungWatt Leistung in Watt
     * @param spannungVolt Spannung in Volt
     */
    public PVModule(String name, double leistungWatt, double spannungVolt) {
        this.name = name;
        this.leistungWatt = leistungWatt;
        this.spannungVolt = spannungVolt;
    }

    /**
     * Gibt den Namen des Moduls zurück.
     *
     * @return Name des Moduls
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt die Leistung des Moduls in Watt zurück.
     *
     * @return Leistung in Watt
     */
    public double getLeistungWatt() {
        return leistungWatt;
    }

    /**
     * Gibt alle Infos des Moduls als Text aus.
     */
    public void zeigeInfo() {
        System.out.println("Modul: " + name);
        System.out.println("Leistung: " + leistungWatt + " W");
        System.out.println("Spannung: " + spannungVolt + " V");
    }
}