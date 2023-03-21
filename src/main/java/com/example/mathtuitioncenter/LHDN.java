package com.example.mathtuitioncenter;

import java.util.ArrayList;

public class LHDN {

    private ArrayList<TaxPayer> workers = new ArrayList<TaxPayer>();

    public void addTaxPayer(TaxPayer tp){
        workers.add(tp);
    }

    public float calcTotalTax() {
        float sum = 0;
        for (int i = 0; i < workers.size(); i++) {
            sum += workers.get(i).calcTaxRate();
        }
        return sum;
    }

    public static void main(String args[]) {
        RegularTeacher rt = new RegularTeacher();
        Cleaner cleaner = new Cleaner();

        LHDN lhdn = new LHDN();
        lhdn.addTaxPayer(rt);
        lhdn.addTaxPayer(cleaner);
    }





}
