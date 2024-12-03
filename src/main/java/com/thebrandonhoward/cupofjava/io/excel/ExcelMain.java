package com.thebrandonhoward.cupofjava.io.excel;

import org.apache.commons.lang3.time.StopWatch;
import org.dhatim.fastexcel.reader.ReadableWorkbook;
import org.dhatim.fastexcel.reader.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ExcelMain {
    public static void main(String[] args) throws IOException {
        read();
    }

    public static void read() throws IOException {

        try (InputStream is = new FileInputStream("FinancialSample.xlsx");
             ReadableWorkbook wb = new ReadableWorkbook(is)) {

            StopWatch watch = new StopWatch();
            watch.start();

            wb.getSheets().forEach(sheet ->
            {
                try (Stream<Row> rows = sheet.openStream()) {

                    rows.skip(1).forEach(r -> {
                        //BigDecimal num = r.getCellAsNumber(0).orElse(null);
                        String str = r.getCellAsString(1).orElse(null);

                        //System.out.println("Cell str value :: " + num);
                        System.out.println("Cell str value :: " + str);
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }

                watch.stop();

                System.out.println("Processing time :: " + watch.getTime(TimeUnit.MILLISECONDS));
            });
        }
    }

}
