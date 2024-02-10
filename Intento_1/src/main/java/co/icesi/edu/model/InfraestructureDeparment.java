package co.icesi.edu.model;

import co.icesi.edu.ui.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class InfraestructureDeparment {

    public static final String BILLBOARD_FILE_NAME = "BillboardDataExported.csv";
    private  ArrayList<Object> billboards;
    public InfraestructureDeparment() throws Exception{
        billboards = new ArrayList<>();
        loadBillboard();
    }

    public double calculateAverageBase() {
        double sumBase = 0;
        System.out.printf(String.valueOf(billboards.size()));

        for (Object billboard : billboards) {
            if (billboard instanceof Billboard b) {
                System.out.println(b.getWidth());
                sumBase = sumBase+ b.getWidth();
            }
        }
        return billboards.isEmpty() ? 0 : sumBase / billboards.size();
    }

    public double calculateAverageHeight() {
        double sumHeight = 0;
        for (Object billboard : billboards) {
            if (billboard instanceof Billboard b) {
                sumHeight += b.getHeight();
            }
        }
        return billboards.isEmpty() ? 0 : sumHeight / billboards.size();
    }

    public double calculateAverageArea() {
        double sumArea = 0;
        for (Object billboard : billboards) {
            if (billboard instanceof Billboard b) {
                sumArea += b.calculateArea();
            }
        }
        return billboards.isEmpty() ? 0 : sumArea / billboards.size();
    }

    public void addBillboard(double w, double h, boolean ui, String b){

    }
    private void saveBillboard(){

    }

    private void loadBillboard()throws Exception{
        String resource = Main.class.getClassLoader().getResource(BILLBOARD_FILE_NAME).getFile();
        File file= new File(resource);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        line = br.readLine();
        while (line != null){
           // System.out.println(line);
           String[] columns = line.split("\\|");
            //System.out.println(Arrays.toString(columns));
            line = br.readLine();
        }

        br.close();
        fr.close();
    }
    public void exportDangerousBillboard(String fn){

    }
    */

    public void importData(String fn){
        String[] columns = fn.split("\\|");
        //System.out.println(Arrays.toString(columns));
        Billboard billboard = new Billboard(Double.parseDouble(columns[0]),Double.parseDouble(columns[1]),Boolean.parseBoolean(columns[2]),columns[3]);
        billboards.add(billboard);
    }

    @Override
    public String toString(){

        return null;
    }

}
