package com.ndangduc.bn;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CollectionData {
    private final static Integer MAX = 4;
    private final static Integer MIN = 1;

    public static void currentTime() {
        System.out.println("[---] THỜI KHẮC HIỆN TẠI:  " + LocalTime.now());
        List<String> dataList = new ArrayList<>();
        dataList.add("===============: ");
        dataList.add("HAPPY");
        dataList.add(" ");
        dataList.add("NEW");
        dataList.add(" ");
        dataList.add("YEAR");
        dataList.add(" ");
        dataList.add("2021");
        dataList.add(" :===============");
        dataList.stream().map(String::toUpperCase).forEach(System.out::print);

    }

    public static void presentForNewYear2021() {
        double number = (Math.random() * ((MAX - MIN) + 1)) + MIN;
        String luckeyNumber = new DecimalFormat("#").format(number);
        System.out.print("\n\n[---] CON SỐ MAY MẮN CỦA BẠN TRONG NĂM 2021 LÀ : " + luckeyNumber);
        System.out.println("\n\n[---] Số " + luckeyNumber + " => BẠN SẼ CÓ 1 MAY MẮN VỀ : " + whichYouWillReceiveIn2021(luckeyNumber));
    }

    public static String whichYouWillReceiveIn2021(String luckey) {
        String present = EnumPresent.HAPPY_FAMILY.toString();
        switch (Integer.valueOf(luckey)) {
            case 1:
                present = EnumPresent.HAPPY_FAMILY.toString();
                break;
            case 2:
                present = EnumPresent.EARN_MORE_MONEY.toString();
                break;
            case 3:
                present = EnumPresent.GOOD_HEALTHY.toString();
                break;
            case 4:
                present = EnumPresent.HAPPY_JOB.toString();
                break;
        }
        return present;
    }

}
