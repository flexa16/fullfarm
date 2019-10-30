package by.flex.utils;

import by.flex.dto.DispenserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class GraphUtils {

    public List<String> dispenserDataList(List<DispenserDto> list){
        Collections.reverse(list);
        List<String> usageList = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            String water = "Water";
            String power = "Power";
            String temp="";
            if(j==0){
                temp=water;
            } else {
                temp = power;}
            String data="{\n" +
                    "                        type: \"spline\",\n" +
                    "                name: \""
                    + temp +
                    " Usage\",\n" +
                    "                showInLegend: true,\n" +
                    "                dataPoints: [";
            for (int i = 0; i < list.size(); i++) {
                String label = "{ label: \"";
                label += list.get(i).getId();
                label+="\" , y: ";
                if(j==0){
                label+=list.get(i).getWaterUsage();}
                else {
                    label+=list.get(i).getPowerUsage();
                }
                if(i==list.size()-1){
                    label+=" }";
                    label+="\n" +
                            "                    ]\n" +
                            "                }";
                } else {
                    label+=" },";}

                data+=label;
            }
            usageList.add(data);
        }
        return usageList;
    }

    public String dispenserDataString(List<String> list){
        String data = "";
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                data+=list.get(i);
            } else {
                data+=list.get(i)+",";
            }
        }
        return  data;
    }

}
