package by.flex.service;

import by.flex.dto.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class GraphService {


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

    public List<String> filterDataList(List< FilterDto > list){
        Collections.reverse(list);
        List<String> usageList = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            String health = "Health";
            String power = "Power";
            String capacity = "Capacity";
            String temp="";
            if(j==0){
                temp=health;
            } else if(j==1) {
                temp = power;}else {
                temp = capacity;
            }
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
                    label+=list.get(i).getFilterHealth();}
                else if(j==2) {
                    label+=list.get(i).getPowerUsage();
                } else {
                    label+=list.get(i).getCapacity();
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

    public List<String> flowerDataList(List< FlowerDto > list){
        Collections.reverse(list);
        List<String> usageList = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            String luxometer = "Luxometer";
            String thermometer = "Thermometer";
            String moisturemeter = "Moisturemeter";
            String mineralsmeter = "Mineralsmeter";
            String temp="";
            if(j==0){
                temp=luxometer;
            } else if(j==1) {
                temp = thermometer;}
              else if(j==2) {
                temp = moisturemeter;}
            else {
                temp = mineralsmeter;
            }
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
                    label+=list.get(i).getLuxometer();}
                else if(j==2) {
                    label+=list.get(i).getThermometer();
                }else if(j==3) {
                    label+=list.get(i).getMoistureMeter();
                } else {
                    label+=list.get(i).getMineralsMeter();
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

    public List<String> heaterDataList(List< HeaterDto > list){
        Collections.reverse(list);
        List<String> usageList = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            String power = "Power";
            String speed = "Fun Speed";
            String temperature = "Temperature";
            String temp="";
            if(j==0){
                temp=power;
            } else if(j==1) {
                temp = speed;}
              else {
                temp = temperature;}
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
                    label+=list.get(i).getPowerUsage();}
                else if(j==2) {
                    label+=list.get(i).getFunSpeed();
                } else {
                    label+=list.get(i).getTemperature();
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

    public List<String> lampDataList(List< LampDto > list){
        Collections.reverse(list);
        List<String> usageList = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            String power = "Power";
            String brightness = "Brightness";
            String temp="";
            if(j==0){
                temp=power;
            } else {
                temp = brightness;}
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
                    label+=list.get(i).getPowerUsage();}
                 else {
                    label+=list.get(i).getBrightness();
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

    public List<String> pumpDataList(List<PumpDto> list){
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





    public String dataString(List<String> list){
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
