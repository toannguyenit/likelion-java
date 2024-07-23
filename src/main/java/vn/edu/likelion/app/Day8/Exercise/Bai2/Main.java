package vn.edu.likelion.app.Day8.Exercise.Bai2;

import vn.edu.likelion.app.Day8.Exercise.Bai2.Model.ITEmployee;
import vn.edu.likelion.app.Day8.Exercise.Bai2.Model.Manager;

import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args) {
        Manager manager = new Manager("Corona Cadogan", new BigDecimal(6000.00), new BigDecimal(1000.00));
        manager.displayinfo();
        System.out.println();

        ITEmployee itEmployee = new ITEmployee("Antal Nuka", new BigDecimal(5000), new BigDecimal(0));
        itEmployee.setOvertimeHours(20);
        itEmployee.setHourlyRate(new BigDecimal(25));
        itEmployee.calculateBonus();
        itEmployee.displayinfo();

    }
}
