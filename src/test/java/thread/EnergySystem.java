package thread;

public class EnergySystem {
    //能量盒子，贮存能量的地方
    private final double[] energyBoxes;

    public EnergySystem(int n,long initialEnergy) {
        energyBoxes = new double[n];
        for (int i = 0; i < n ; i++) {
            this.energyBoxes[i] = initialEnergy;
        }
    }

    public synchronized void transfer(int from, int to, double account){
        if (energyBoxes[from] < account){
            return;
        }
        System.out.print(Thread.currentThread().getName());
        energyBoxes[from] -= account;
        System.out.printf("从%d转移%10.2f单位能量到%d",from,account,to);
        energyBoxes[to] += account;
        System.out.printf("能量总和%10.2f%n",getTotal());
    }

    public double getTotal(){
        double total = 0;
        for (double d : energyBoxes){
            total += d;
        }
        return total;
    }

    public int length(){
        return energyBoxes.length;
    }
}

class EnergyTransferTask implements Runnable{
    private EnergySystem system;

    private int fromBox;

    private double maxAccount;

    private int DELAY = 10;

    public EnergyTransferTask(EnergySystem system, int fromBox, double maxAccount) {
        this.system = system;
        this.fromBox = fromBox;
        this.maxAccount = maxAccount;
    }

    @Override
    public void run() {
        try {

                int toBox = (int)(system.length()*Math.random());
                double account = maxAccount*Math.random();
                system.transfer(fromBox,toBox,account);
                Thread.sleep((int)(DELAY*Math.random()));

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EnergySystem system = new EnergySystem(100,1000);
        for (int i=0; i<100; i++){
            EnergyTransferTask task = new EnergyTransferTask(system, i, 1000);
            Thread t = new Thread(task,"Thread-"+i);
            t.start();
        }
    }
}
