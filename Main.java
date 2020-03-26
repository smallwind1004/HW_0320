import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ctmp = " ";
        int ntmp = 0;
        ArrayList<Truck> trucks = new ArrayList<Truck>();
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Sedan> sedans = new ArrayList<Sedan>();
        ArrayList<Suv> suvs = new ArrayList<Suv>();

        while (true) {
            System.out.println(
                    "menu:\n1: Add new Car\n2: Search Car by name\n3: Search Car by category\n4: Update Car\n5: Show Car list\n6: Exit.\noperations: ");
            String tmp = sc.nextLine();
            /* ok */ if (tmp.equals("1")) {
                System.out.println("category : T: Truck    B: Bus    Se: Sedan    Su: SUV");
                while (true) {
                    System.out.print("category->");
                    tmp = sc.nextLine();
                    if (tmp.equals("T") || tmp.equals("t")) {
                        System.out.println("name :");
                        trucks.add(new Truck(sc.nextLine()));
                        System.out.println("color :");
                        trucks.get(trucks.size() - 1).setColor(sc.nextLine());
                        System.out.println("capacity :");
                        trucks.get(trucks.size() - 1).setCapacity(sc.nextLine());
                        System.out.println("powertype :");
                        trucks.get(trucks.size() - 1).setPowetype(sc.nextLine());
                        System.out.println("weight :");
                        trucks.get(trucks.size() - 1).setWeight(sc.nextLine());
                        System.out.println("displacement :");
                        trucks.get(trucks.size() - 1).setDisp(sc.nextLine());
                        System.out.println("produce year :");
                        trucks.get(trucks.size() - 1).setYear(sc.nextLine());
                        System.out.println("goodcapacity :");
                        trucks.get(trucks.size() - 1).setGcapacity(sc.nextLine());
                        System.out.println("tairs :");
                        trucks.get(trucks.size() - 1).setTairsNum(sc.nextLine());
                    }
                    if (tmp.equals("B") || tmp.equals("b")) {
                        System.out.println("name :");
                        buses.add(new Bus(sc.nextLine()));
                        System.out.println("color :");
                        buses.get(buses.size() - 1).setColor(sc.nextLine());
                        System.out.println("capacity :");
                        buses.get(buses.size() - 1).setCapacity(sc.nextLine());
                        System.out.println("powertype :");
                        buses.get(buses.size() - 1).setPowetype(sc.nextLine());
                        System.out.println("weight :");
                        buses.get(buses.size() - 1).setWeight(sc.nextLine());
                        System.out.println("displacement :");
                        buses.get(buses.size() - 1).setDisp(sc.nextLine());
                        System.out.println("produce year :");
                        buses.get(buses.size() - 1).setYear(sc.nextLine());
                        System.out.println("people :");
                        buses.get(buses.size() - 1).setPeopleNum(sc.nextLine());
                        System.out.println("doors :");
                        buses.get(buses.size() - 1).setDoorNum(sc.nextLine());
                        System.out.println("company :");
                        buses.get(buses.size() - 1).setCompany(sc.nextLine());
                    }
                    if (tmp.equals("Se") || tmp.equals("se") || tmp.equals("SE") || tmp.equals("sE")) {
                        System.out.println("name :");
                        sedans.add(new Sedan(sc.nextLine()));
                        System.out.println("color :");
                        sedans.get(sedans.size() - 1).setColor(sc.nextLine());
                        System.out.println("capacity :");
                        sedans.get(sedans.size() - 1).setCapacity(sc.nextLine());
                        System.out.println("powertype :");
                        sedans.get(sedans.size() - 1).setPowetype(sc.nextLine());
                        System.out.println("weight :");
                        sedans.get(sedans.size() - 1).setWeight(sc.nextLine());
                        System.out.println("displacement :");
                        sedans.get(sedans.size() - 1).setDisp(sc.nextLine());
                        System.out.println("produce year :");
                        sedans.get(sedans.size() - 1).setYear(sc.nextLine());
                        System.out.println("people :");
                        sedans.get(sedans.size() - 1).setPeopleNum(sc.nextLine());
                        System.out.println("type :");
                        sedans.get(sedans.size() - 1).setType(sc.nextLine());
                        System.out.println("use :");
                        sedans.get(sedans.size() - 1).setUse(sc.nextLine());
                    }
                    if (tmp.equals("Su") || tmp.equals("su") || tmp.equals("SU") || tmp.equals("sU")) {
                        System.out.println("name :");
                        suvs.add(new Suv(sc.nextLine()));
                        System.out.println("color :");
                        suvs.get(suvs.size() - 1).setColor(sc.nextLine());
                        System.out.println("capacity :");
                        suvs.get(suvs.size() - 1).setCapacity(sc.nextLine());
                        System.out.println("powertype :");
                        suvs.get(suvs.size() - 1).setPowetype(sc.nextLine());
                        System.out.println("weight :");
                        suvs.get(suvs.size() - 1).setWeight(sc.nextLine());
                        System.out.println("displacement :");
                        suvs.get(suvs.size() - 1).setDisp(sc.nextLine());
                        System.out.println("produce year :");
                        suvs.get(suvs.size() - 1).setYear(sc.nextLine());
                        System.out.println("type :");
                        suvs.get(suvs.size() - 1).setType(sc.nextLine());
                        System.out.println("price");
                        suvs.get(suvs.size() - 1).setPrice(sc.nextLine());
                    }
                    System.out.println("continue?(y/n)");
                    tmp = sc.nextLine();
                    if (tmp.equals("n") || tmp.equals("N")) {
                        ctmp = " ";
                        ntmp = 0;
                        break;
                    }
                }

            }
            /* ok */ if (tmp.equals("2")) {
                System.out.println("Search Car by name :");
                while (true) {
                    System.out.print("->");
                    tmp = sc.nextLine();
                    for (int i = 0; i < trucks.size(); i++) {
                        if (tmp.equals(trucks.get(i).getName())) {
                            ctmp = "t";
                            ntmp = i;
                        }
                    }
                    for (int i = 0; i < buses.size(); i++) {
                        if (tmp.equals(buses.get(i).getName())) {
                            ctmp = "b";
                            ntmp = i;
                        }
                    }
                    for (int i = 0; i < sedans.size(); i++) {
                        if (tmp.equals(sedans.get(i).getName())) {
                            ctmp = "se";
                            ntmp = i;
                        }
                    }
                    for (int i = 0; i < suvs.size(); i++) {
                        if (tmp.equals(suvs.get(i).getName())) {
                            ctmp = "su";
                            ntmp = i;
                        }
                    }
                    if (ctmp.equals("t")) {
                        System.out.println(trucks.get(ntmp).showAll());
                    } else if (ctmp.equals("b")) {
                        System.out.println(buses.get(ntmp).showAll());
                    } else if (ctmp.equals("se")) {
                        System.out.println(sedans.get(ntmp).showAll());
                    } else if (ctmp.equals("su")) {
                        System.out.println(suvs.get(ntmp).showAll());
                    } else {
                        System.out.println("Car no found.");
                    }
                    System.out.println("continue?(y/n)");
                    tmp = sc.nextLine();
                    if (tmp.equals("n") || tmp.equals("N")) {
                        ctmp = " ";
                        ntmp = 0;
                        break;
                    }
                }
            }
            /* ok */ if (tmp.equals("3")) {
                while (true) {
                    System.out.println("Search Car by category: T: Truck    B: Bus    Se: Sedan    Su: SUV");
                    System.out.print("category->");
                    tmp = sc.nextLine();
                    if (tmp.equals("t") || tmp.equals("T") || tmp.equals("Truck") || tmp.equals("truck")) {
                        for (int i = 0; i < trucks.size(); i++) {
                            System.out.println(i + "=>" + trucks.get(i).getName());
                            System.out.println("-----------");
                        }
                    } else if (tmp.equals("b") || tmp.equals("B") || tmp.equals("Bus") || tmp.equals("bus")) {
                        for (int i = 0; i < buses.size(); i++) {
                            System.out.println(i + "=>" + buses.get(i).getName());
                            System.out.println("-----------");
                        }
                    } else if (tmp.equals("se") || tmp.equals("Se") || tmp.equals("SE") || tmp.equals("sE")
                            || tmp.equals("Sedan") || tmp.equals("sedan")) {
                        for (int i = 0; i < sedans.size(); i++) {
                            System.out.println(i + "=>" + sedans.get(i).getName());
                            System.out.println("-----------");
                        }
                    } else if (tmp.equals("su") || tmp.equals("Su") || tmp.equals("SU") || tmp.equals("sU")
                            || tmp.equals("Suv") || tmp.equals("suv")) {
                        for (int i = 0; i < trucks.size(); i++) {
                            System.out.println(i + "=>" + suvs.get(i).getName());
                            System.out.println("-----------");
                        }
                    }
                    ntmp = Integer.parseInt(sc.nextLine());
                    if (tmp.equals("t") || tmp.equals("T") || tmp.equals("Truck") || tmp.equals("truck")) {
                        System.out.println(trucks.get(ntmp).showAll());
                    } else if (tmp.equals("b") || tmp.equals("B") || tmp.equals("Bus") || tmp.equals("bus")) {
                        System.out.println(buses.get(ntmp).showAll());
                    } else if (tmp.equals("se") || tmp.equals("Se") || tmp.equals("SE") || tmp.equals("sE")
                            || tmp.equals("Sedan") || tmp.equals("sedan")) {
                        System.out.println(sedans.get(ntmp).showAll());
                    } else if (tmp.equals("su") || tmp.equals("Su") || tmp.equals("SU") || tmp.equals("sU")
                            || tmp.equals("Suv") || tmp.equals("suv")) {
                        System.out.println(suvs.get(ntmp).showAll());
                    } else {
                    }
                    System.out.println("continue?(y/n)");
                    tmp = sc.nextLine();
                    if (tmp.equals("n") || tmp.equals("N")) {
                        ctmp = " ";
                        ntmp = 0;
                        break;
                    }
                }
            }
            if (tmp.equals("4")) {
                System.out.println("Update Car :");
                while (true) {
                    System.out.print("category->");
                    tmp = sc.nextLine();
                    if (tmp.equals("t") || tmp.equals("T") || tmp.equals("Truck") || tmp.equals("truck")) {
                        for (int i = 0; i < trucks.size(); i++) {
                            System.out.println(i + "=>" + trucks.get(i).getName());
                            System.out.println("-----------");
                        }
                    } else if (tmp.equals("b") || tmp.equals("B") || tmp.equals("Bus") || tmp.equals("bus")) {
                        for (int i = 0; i < buses.size(); i++) {
                            System.out.println(i + "=>" + buses.get(i).getName());
                            System.out.println("-----------");
                        }
                    } else if (tmp.equals("se") || tmp.equals("Se") || tmp.equals("SE") || tmp.equals("sE")
                            || tmp.equals("Sedan") || tmp.equals("sedan")) {
                        for (int i = 0; i < sedans.size(); i++) {
                            System.out.println(i + "=>" + sedans.get(i).getName());
                            System.out.println("-----------");
                        }
                    } else if (tmp.equals("su") || tmp.equals("Su") || tmp.equals("SU") || tmp.equals("sU")
                            || tmp.equals("Suv") || tmp.equals("suv")) {
                        for (int i = 0; i < trucks.size(); i++) {
                            System.out.println(i + "=>" + suvs.get(i).getName());
                            System.out.println("-----------");
                        }
                    }
                    ntmp = Integer.parseInt(sc.nextLine());
                    if (tmp.equals("t") || tmp.equals("T") || tmp.equals("Truck") || tmp.equals("truck")) {
                        System.out.println("Which want to change?");
                        System.out.println(
                                "1.name, 2.color, 3.capacity, 4.powertype, 5.weight, 6.disp, 7.year, 8.gcapacity, 9.tairsNum");
                        tmp = sc.nextLine();
                        if (tmp.equals("1")) {
                            tmp = trucks.get(ntmp).getName();
                            trucks.get(ntmp).setName(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getName());
                        }
                        if (tmp.equals("2")) {
                            tmp = trucks.get(ntmp).getColor();
                            trucks.get(ntmp).setColor(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getColor());6
                        }
                        if (tmp.equals("3")) {
                            tmp = trucks.get(ntmp).getCapacity();
                            trucks.get(ntmp).setCapacity(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getCapacity());
                        }
                        if (tmp.equals("4")) {
                            tmp = trucks.get(ntmp).getPowertype();
                            trucks.get(ntmp).setPowetype(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getPowertype());
                        }
                        if (tmp.equals("5")) {
                            tmp = trucks.get(ntmp).getWeight();
                            trucks.get(ntmp).setWeight(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getWeight());
                        }
                        if (tmp.equals("6")) {
                            tmp = trucks.get(ntmp).getDisp();
                            trucks.get(ntmp).setDisp(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getDisp());
                        }
                        if (tmp.equals("7")) {
                            tmp = trucks.get(ntmp).getYear();
                            trucks.get(ntmp).setYear(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getYear());
                        }
                        if (tmp.equals("8")) {
                            tmp = trucks.get(ntmp).getGcapacity();
                            trucks.get(ntmp).setGcapacity(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getGcapacity());
                        }
                        if (tmp.equals("9")) {
                            tmp = trucks.get(ntmp).getTairsNum();
                            trucks.get(ntmp).setTairsNum(sc.nextLine());
                            System.out.println(tmp + " -> " + trucks.get(ntmp).getTairsNum());
                        }
                    } else if (tmp.equals("b") || tmp.equals("B") || tmp.equals("Bus") || tmp.equals("bus")) {
                        System.out.println("Which want to change?");
                        System.out.println(
                                "1.name, 2.color, 3.capacity, 4.powertype, 5.weight, 6.disp, 7.year, 8.peopleNum, 9.doorNum, 10.company");
                        tmp = sc.nextLine();
                        if (tmp.equals("1")) {
                            tmp = buses.get(ntmp).getName();
                            buses.get(ntmp).setName(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getName());
                        }
                        if (tmp.equals("2")) {
                            tmp = buses.get(ntmp).getColor();
                            buses.get(ntmp).setColor(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getColor());
                        }
                        if (tmp.equals("3")) {
                            tmp = buses.get(ntmp).getCapacity();
                            buses.get(ntmp).setCapacity(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getCapacity());
                        }
                        if (tmp.equals("4")) {
                            tmp = buses.get(ntmp).getPowertype();
                            buses.get(ntmp).setPowetype(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getPowertype());
                        }
                        if (tmp.equals("5")) {
                            tmp = buses.get(ntmp).getWeight();
                            buses.get(ntmp).setWeight(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getWeight());
                        }
                        if (tmp.equals("6")) {
                            tmp = buses.get(ntmp).getDisp();
                            buses.get(ntmp).setDisp(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getDisp());
                        }
                        if (tmp.equals("7")) {
                            tmp = buses.get(ntmp).getYear();
                            buses.get(ntmp).setYear(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getYear());
                        }
                        if (tmp.equals("8")) {
                            tmp = buses.get(ntmp).getPeopleNum();
                            buses.get(ntmp).setPeopleNum(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getPeopleNum());
                        }
                        if (tmp.equals("9")) {
                            tmp = buses.get(ntmp).getDoorNum();
                            buses.get(ntmp).setDoorNum(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getDoorNum());
                        }
                        if (tmp.equals("10")) {
                            tmp = buses.get(ntmp).getCompany();
                            buses.get(ntmp).setCompany(sc.nextLine());
                            System.out.println(tmp + " -> " + buses.get(ntmp).getCompany());
                        }
                    } else if (tmp.equals("se") || tmp.equals("Se") || tmp.equals("SE") || tmp.equals("sE")
                            || tmp.equals("Sedan") || tmp.equals("sedan")) {
                        System.out.println("Which want to change?");
                        System.out.println(
                                "1.name, 2.color, 3.capacity, 4.powertype, 5.weight, 6.disp, 7.year, 8.peopleNum, 9.type, 10.use");
                        tmp = sc.nextLine();
                        if (tmp.equals("1")) {
                            tmp = sedans.get(ntmp).getName();
                            sedans.get(ntmp).setName(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getName());
                        }
                        if (tmp.equals("2")) {
                            tmp = sedans.get(ntmp).getColor();
                            sedans.get(ntmp).setColor(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getColor());
                        }
                        if (tmp.equals("3")) {
                            tmp = sedans.get(ntmp).getCapacity();
                            sedans.get(ntmp).setCapacity(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getCapacity());
                        }
                        if (tmp.equals("4")) {
                            tmp = sedans.get(ntmp).getPowertype();
                            sedans.get(ntmp).setPowetype(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getPowertype());
                        }
                        if (tmp.equals("5")) {
                            tmp = sedans.get(ntmp).getWeight();
                            sedans.get(ntmp).setWeight(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getWeight());
                        }
                        if (tmp.equals("6")) {
                            tmp = sedans.get(ntmp).getDisp();
                            sedans.get(ntmp).setDisp(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getDisp());
                        }
                        if (tmp.equals("7")) {
                            tmp = sedans.get(ntmp).getYear();
                            sedans.get(ntmp).setYear(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getYear());
                        }
                        if (tmp.equals("8")) {
                            tmp = sedans.get(ntmp).getPeopleNum();
                            sedans.get(ntmp).setPeopleNum(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getPeopleNum());
                        }
                        if (tmp.equals("9")) {
                            tmp = sedans.get(ntmp).getType();
                            sedans.get(ntmp).setType(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getType());
                        }
                        if (tmp.equals("10")) {
                            tmp = sedans.get(ntmp).getUse();
                            sedans.get(ntmp).setUse(sc.nextLine());
                            System.out.println(tmp + " -> " + sedans.get(ntmp).getUse());
                        }
                    } else if (tmp.equals("su") || tmp.equals("Su") || tmp.equals("SU") || tmp.equals("sU")
                            || tmp.equals("Suv") || tmp.equals("suv")) {
                        System.out.println("Which want to change?");
                        System.out.println(
                                "1.name, 2.color, 3.capacity, 4.powertype, 5.weight, 6.disp, 7.year, 8.price, 9.type");
                        tmp = sc.nextLine();
                        if (tmp.equals("1")) {
                            tmp = suvs.get(ntmp).getName();
                            suvs.get(ntmp).setName(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getName());
                        }
                        if (tmp.equals("2")) {
                            tmp = suvs.get(ntmp).getColor();
                            suvs.get(ntmp).setColor(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getColor());
                        }
                        if (tmp.equals("3")) {
                            tmp = suvs.get(ntmp).getCapacity();
                            suvs.get(ntmp).setCapacity(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getCapacity());
                        }
                        if (tmp.equals("4")) {
                            tmp = suvs.get(ntmp).getPowertype();
                            suvs.get(ntmp).setPowetype(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getPowertype());
                        }
                        if (tmp.equals("5")) {
                            tmp = suvs.get(ntmp).getWeight();
                            suvs.get(ntmp).setWeight(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getWeight());
                        }
                        if (tmp.equals("6")) {
                            tmp = suvs.get(ntmp).getDisp();
                            suvs.get(ntmp).setDisp(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getDisp());
                        }
                        if (tmp.equals("7")) {
                            tmp = suvs.get(ntmp).getYear();
                            suvs.get(ntmp).setYear(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getYear());
                        }
                        if (tmp.equals("8")) {
                            tmp = suvs.get(ntmp).getPrice();
                            suvs.get(ntmp).setPrice(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getPrice());
                        }
                        if (tmp.equals("9")) {
                            tmp = suvs.get(ntmp).getType();
                            suvs.get(ntmp).setType(sc.nextLine());
                            System.out.println(tmp + " -> " + suvs.get(ntmp).getType());
                        }
                    } else {
                    }
                    System.out.println("continue?(y/n)");
                    tmp = sc.nextLine();
                    if (tmp.equals("n") || tmp.equals("N")) {
                        ctmp = " ";
                        ntmp = 0;
                        break;
                    }
                }
            }
            /* ok */ if (tmp.equals("5")) {
                System.out.println("show list :");
                System.out.println("Truck :");
                for (int i = 0; i < trucks.size(); i++) {
                    System.out.println(trucks.get(i).showInfo());
                    System.out.println("----------");
                }
                System.out.println("==========");
                System.out.println("Bus :");
                for (int i = 0; i < buses.size(); i++) {
                    System.out.println(buses.get(i).showInfo());
                    System.out.println("----------");
                }
                System.out.println("==========");
                System.out.println("Sedan :");
                for (int i = 0; i < sedans.size(); i++) {
                    System.out.println(sedans.get(i).showInfo());
                    System.out.println("----------");
                }
                System.out.println("==========");
                System.out.println("Suv :");
                for (int i = 0; i < suvs.size(); i++) {
                    System.out.println(suvs.get(i).showInfo());
                    System.out.println("----------");
                }
                System.out.println("==========");
            }
            /* ok */ if (tmp.equals("6")) {
                break;
            }
        }
    }
}