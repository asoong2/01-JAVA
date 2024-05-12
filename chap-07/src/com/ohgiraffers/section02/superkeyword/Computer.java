package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    /* 컴퓨터는 하나의 상품이지만, 모든 상품은 컴퓨터가 아니다 (IS - A) */

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    /* 기본 생성자 */
    Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출 .... ");
    }

    public Computer(String cpu, int hdd, int ram,
                    String operationSystem)
        /* Product의 기본 생성자 호출 */
    {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출 ... ");
    }

    /* 부모 클래스의 필드도 모두 초기화 하는 생성자 */
    public Computer(String code, String brand, String name, int price,
                    Date manufacturedDate, String cpu, int hdd,
                    int ram, String operationSystem)
    /* Product 의 매개변수 생성자 호출 */
    {
        super(code, brand, name, price, manufacturedDate);

        /* this()로 위에 작성한 생성자를 호출한다는 것은 super()를 두 번 호출하는 것과
         * 같기 때문에 허용되지 않는다. 부모 인스턴스를 두 개 생성할 수 없기 때문에
         * 부모 생성자는 한 번만 호출 가능하다.*/

        //this(cpu,hdd,ram,operationSystem);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드도 초기화 하는 생성자 호출 ... ");
    }

    /* getter and setter는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용 가능하므로
     * 별도 작성이 필요 없다. 따라서 자식 클래스의 추가된 필드에 대해서만 작성한다. */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    @Override
    public String getInformation(){
        /* 부모 클래스의 getter를 이용해서 부모 필드가 가진 값도 한 번에
         * 문자열 합치기에 넣을 수 있다. 부모의 멤버는 super.와 this. 둘 다 사용 가능하나
         * 코드의 의미를 명확하게 하기 위해 super. 를 사용 했다. */

//        return "Computer ["
//                + "code = " +  super.getCode() +
//                ", brand = " + super.getBrand() +
//                ", name = " + super.getName() +
//                ", price = " + super.getPrice() +
//                ", manufacturedDate = " + super.getManufacturedDate()
//                + ", cpu = " + this.cpu + ", hdd = " + this.hdd
//                + ", ram = " + this.ram +
//                ", operationSystem = " + this.operationSystem + "]";

        /* Product에 있는 getInformation()에서 이미 작성해둔 필드를 문자열로 반환하는 내용이 있다.
         * 부모 클래스의 메소드를 호출해서 반환 받은 문자열에 현재 클래스의 필드 값을 추가로 덧붙여보자. */

        /* return this.getInformation() 쓸 시 Computer의 메소드를 사용하는 것으로 인식하고
         * 재귀호출로 인해 StackOverflow 컴파일 에러가 발생한다.
         * 부모 클래스를 상속한 메소드를 사용할 경우엔 super를 써주자. */

        return super.getInformation()
                +"Computer["
                + "cpu = " + this.cpu
                + ", hdd = " + this.hdd
                + ", ram = " + this.ram
                + ", operationSystem = " + this.operationSystem
                + "]";
    }



}