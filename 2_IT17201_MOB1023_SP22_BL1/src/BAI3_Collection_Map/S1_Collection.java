/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_Collection_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Dungna89
 */
public class S1_Collection {
   public static void main(String[] args) {
        /*Mảng Array có số phần tử cố định. 
        - Array phải định kiểu có thể là kiểu nguyên thủy và kiểu đối tượng
        - Không thể sung thêm hoặc xóa bớt kích thước mảng
        - Lãng phí bộ nhớ:
             - Nếu khai báo mảng với kích thước lớn để nắm giữ một vài phần tử
             - Khai báo mảng với kích thước nhỏ thì không đủ chứa*/
        int[] arrYear = new int[5];
        arrYear[0] = 5;
        arrYear[1] = 5;
        arrYear[2] = 5;
        Student[] arrStudent = new Student[5];
        Student student111 = new Student("Dung", "JAVA1", 20);
        arrStudent[0] = student111;
        /*Mảng ArrayList được xem như mảng động
        - Có thể thêm bớt các phần tử một cách mềm dẻo
        - ArrayList còn cho phép thực hiện các phép toán tập hợp như,giao,hiệu...
        - ArrayList có các phương thức của lớp add,addAll,get,indexOf,remove.....
         */
        ArrayList arrlstKhongDinhKieu = new ArrayList();//ArrayList List không định kiểu
        //Phương thức add
        arrlstKhongDinhKieu.add("Duy Anh");
        arrlstKhongDinhKieu.add(2020);
        arrlstKhongDinhKieu.add(2020);//Interger
        arrlstKhongDinhKieu.add(1.5);//Double
        arrlstKhongDinhKieu.add("a");
        arrlstKhongDinhKieu.add(true);

        ArrayList<Double> arrlstCodinhKieuDouble = new ArrayList<Double>();//ArrayList List định kiểu dữ liệu 
        arrlstCodinhKieuDouble.add(9.5);
        arrlstCodinhKieuDouble.add(7.5);
        arrlstCodinhKieuDouble.add(4.5);

        Student student1 = new Student("Dung", "JAVA1", 20);
        Student student2 = new Student("Phong1", "JAVA1", 21);
        Student student3 = new Student("Duy", "JAVA1", 18);
        Student student4 = new Student("HOA", "JAVA1", 19);
        ArrayList<Student> arrlstStudent1 = new ArrayList<Student>();//ArrayList List định kiểu là một đối tượng
        arrlstStudent1.add(student1);
        arrlstStudent1.add(student2);
        arrlstStudent1.add(student3);//Add 1 OBJ vào list student

        /*"Collection" và "Collections" trong java là hai khái niệm khác nhau. 
        + Collection là một interface cấp cao nhất nhất của Collection Framework. 
        + Trong khi đó, Collections là một lớp tiện ích. 
        + Collections bao gồm các phương thức static được sử dụng để thao tác trên các đối tượng của 
          Collection (List, ArrayList, LinkedList, Map, Set, …).*/
        //Collection là cấu trúc dữ liệu được sử dụng để nắm giữ nhiều phần tử
        //Có thể THÊM,XÓA,CẬP NHẬT các phần tử trong Collection
        //Hợp,giáo trừ... các tập hợp
        //Collection được chia làm 2 loại List và Set
        // - List là Collection mà mỗi phần tử được phép xuất hiện nhiều lần và truy xuất chỉ bằng số
        //JavaList();
        
        // - Set(Tập hợp) là Collection mà mỗi phần tử chỉ được phép xuất hiện 1 lần và không được phép truy xuất 
        // theo chỉ số (index)
        JavaSet();
        /* Map Interface
            - Trong java, map được sử dụng để lưu trữ và truy xuất dữ liệu theo 
              cặp khóa (key) và giá trị (value). Mỗi cặp key và value được gọi là entry.
            - Map chỉ chứa các giá trị key duy nhất, không  chứa các key trùng lặp. 
        
         */
        //JavaMap();
    }

    static void JavaSet() {
        System.out.println("----- Khởi tạo 1 Set Không Định Kiểu ------");
        //Set không định kiểu
        Set setKhongDinhKieu = new HashSet();
        setKhongDinhKieu.add("100");
        setKhongDinhKieu.add("Dũng");
        setKhongDinhKieu.add(1);
        setKhongDinhKieu.add(1);
        //Cách để in tập hợp ra màn hình và sẽ không in ra phần tử trùng nhau 
        System.out.println(setKhongDinhKieu.toString());

        System.out.println("----- Khởi tạo 1 Set Kiểu String ------");
        // Tạo ra một hợp kiểu kiểu dữ liệu string
        Set<String> items = new HashSet<>();
        items.add("Dũng"); // Thêm phần tử vào Set
        items.add("Hoàng");
        items.add("Hoàng"); // Phần tử loại bỏ vì trùng
        items.add("Long");
        items.add("Long");
        System.out.println(items.toString());//In dùng câu lệnh toString
        // Dùng foreach để in tập hợp set ra màn hình
        for (String item : items) {
            System.out.print(item + " ");
        }
        /*
        public boolean add(Object element)	Thêm một phần tử vào collection.
        public boolean addAll(Collection c)	Thêm các phần tử collection được chỉ định vào collection gọi phương thức này.
        public boolean remove(Object element)	Xóa phần tử ra khỏi collection.
        public boolean removeAll(Collection c)	Xóa tất cả các phần tử từ collection được chỉ định ra khỏi collection gọi phương thức này.
        public boolean retainAll(Collection c)	Xóa tất cả các thành phần từ collection gọi phương thức này ngoại trừ collection được chỉ định.
        public int size()	Trả về tổng số các phần tử trong collection.
        public void clear()	Xóa tất cả các phần tử trong Collection, sau khi thực hiện phương thức này, Collection sẽ rỗng (empty)
        public boolean contains(Object element)	Kiểm tra một phần tử có nằm trong Collection không
        public boolean containsAll(Collection c)	Kiểm tra một Collection có chứa tất cả các phần tử của một Collection khác
        public Iterator iterator()	Trả về một iterator.
        public Object[] toArray()	Chuyển đổi collection thành mảng (array).
        public boolean isEmpty()	Kiểm tra Collection có rỗng hay không.
        public boolean equals(Object element)	So sánh 2 collection.
        public int hashCode()	Trả về số hashcode của collection.
         */

    }

    static void JavaList() {
        /*  void add(int index, Object obj)	Chèn obj vào trong List đang gọi tại index đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè.
            boolean addAll(int index, Collection c)	Chèn tất cả phần tử của c vào trong List đang gọi tại chỉ mục đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè. Trả về true nếu List đang gọi thay đổi và nếu không trả về false.
            object get(int index)	Trả về đối tượng được lưu giữ tại index đã cho bên trong Collection đang gọi.
            int indexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về.
            int lastIndexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về
            ListIterator listIterator()	Sử dụng để trả về một Iterator mà bắt đầu từ phần tử đầu tiên của list.
            ListIterator listIterator(int index)	Sử dụng để trả về một Iterator mà phần tử bắt đầu từ chỉ số index chỉ định.
            object remove(int index)	Gỡ bỏ phần tử tại index từ List đang gọi và trả về phần tử bị xóa đó. List kết quả được compact lại. Đó là, các chỉ mục của dãy phần tử phụ bị lượng giảm đi 1.
            object set(int index, Object obj)	Gán obj tới vị trí được xác định bởi index bên trong List đang gọi.
            List subList(int start, int end)	Trả về một list mà bao gồm các phần tử từ start tới end-1 trong List đang gọi. Các phần tử trong list trả về cũng được tham chiếu bởi đối tượng đang gọi.*/
        
        //1. List không định kiểu
        List lstKhongDinhKieu = new ArrayList();
        //Phương thức add
        lstKhongDinhKieu.add("Duy Anh");
        lstKhongDinhKieu.add(2020);
        lstKhongDinhKieu.add(2020);//Interger
        lstKhongDinhKieu.add(1.5);//Double
        lstKhongDinhKieu.add("a");
        lstKhongDinhKieu.add(true);

        //Khi add thêm tử kiểu dữ liệu nguyên thủy thì nó tự động chuyển sang đối tượng Wrapper
        //int temp1 = lstKhongDinhKieu.get(2);//Lỗi
        //int temp = (int) lstKhongDinhKieu.get(2);
        //System.out.println(temp);
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
        //Double temp = (Double) lstKhongDinhKieu.get(3);
        //Phương thức get dùng để lấy giá trị trong List theo index
//        System.out.println(lstKhongDinhKieu.get(5));
//        for (Object x : lstKhongDinhKieu) {
//            System.out.println(x);
//        }

        // 2. List có định kiểu
        List<Double> lstCodinhKieuDouble = new ArrayList<Double>();
        lstCodinhKieuDouble.add(9.5);
        lstCodinhKieuDouble.add(7.5);
        lstCodinhKieuDouble.add(4.5);
        double temp = lstCodinhKieuDouble.get(0);
        Double temp2 = lstCodinhKieuDouble.get(0);

        //Cách Convert từ Array về List 
        // Tạo một mảng chuỗi tên
        String[] arrString = {"Duy Anh", "My MY", "Sy Phong"};
        //Cần khai báo thêm một list tạm
        List<String> lstArrStringTemp = Arrays.asList(arrString);//List phụ
        List<String> lstStringName = new ArrayList<String>();//List chính
        lstStringName.add("Dung");
        lstStringName.addAll(lstArrStringTemp);//Phương thức add all phải truyền vào một List khác
        Collections.sort(lstStringName);//Sắp Sếp cái list phải cùng kiểu dữ liệu
        for (String x : lstStringName) {
            System.out.println(x);
        }
        
        
        Student student1 = new Student("Dung", "JAVA1", 19);
        //Khai báo đối tượng và khởi tạo giá trị cho lớp Student
        Student student2 = new Student("Phong", "JAVA1", 19);
        Student student3 = new Student("Duy", "JAVA1", 19);
        Student student4 = new Student("HOA", "JAVA1", 19);
        List<Student> lstStudent = new ArrayList<Student>();
        lstStudent.add(student1);
        lstStudent.add(student2);
        lstStudent.add(student3);//Add 1 OBJ vào list student
        lstStudent.add(0, student4);

        Collections.sort(lstStudent, Collections.reverseOrder());
        //lstStudent.addAll(lstStudent);//add all truyền cả 1 list student
        //Lấy 1 phần tử trong List ra
        //System.out.println(lstStudent.get(0).getTenSV() + lstStudent.get(0).getMonSV());
//        for (Student x : lstStudent) {//x là cả 1 đối tượng student cần phải chấm để lấy các thuộc tính của nó
//            System.out.println(x.getTenSV() + x.getMonSV());
//        }
        System.out.println(lstStudent.size());
        for (int i = 0; i < lstStudent.size(); i++) {
            System.out.println(lstStudent.get(i).getTenSV() + lstStudent.get(i).getTuoiSV());
        }
        System.out.println("--------------");
        //Xóa phẩn tử trong mảng
        //lstStudent.remove(0);//Xóa phẩn tử trong List tại vị trí 0
        for (int i = 0; i < lstStudent.size(); i++) {
            System.out.println(lstStudent.get(i).getTenSV() + lstStudent.get(i).getTuoiSV());
        }
        //lstStudent.remove(student1);//Xóa obj
        for (Student x : lstStudent) {
            lstStudent.remove(x);
            if (x.getTenSV().equals("Dung")) {
                lstStudent.remove(x);//Xóa obj
            }
        }
        System.out.println("--------------");
        for (int i = 0; i < lstStudent.size(); i++) {
            System.out.println(lstStudent.get(i).getTenSV() + lstStudent.get(i).getTuoiSV());
        }
        //Sắp xếp list
//        Arrays.sort(a);;

        System.out.println("---------------------------");
        //Duyệt các phần tử trong List listIterator
        System.out.println("Duyệt các phẩn tử");
        ListIterator<Student> listIterator = lstStudent.listIterator();
        System.out.println("Duyệt các phần vị trí con trỏ từ đầu của LIST");
        while (listIterator.hasNext()) {
            System.out.println("\t" + listIterator.next().getTenSV());
        }
        System.out.println("Duyệt các phần vị trí con trỏ từ cuối của LIST");
        while (listIterator.hasPrevious()) {
            System.out.println("\t" + listIterator.previous().getTenSV());
        }

        //Kiểm tra List có rỗng hay không
        List<Student> lstStudent1 = new ArrayList<Student>();

        if (lstStudent1.isEmpty()) {
            System.out.println("Hiện tại danh sách sinh viên đang không có gì");
        } else {
            for (Student student : lstStudent1) {
                System.out.println(student.getTenSV());
            }
        }

    }

    static void JavaArrayList() {
        //ArrayList List không định kiểu
        ArrayList arrlstKhongDinhKieu = new ArrayList();
        //Phương thức add
        arrlstKhongDinhKieu.add("Duy Anh");
        arrlstKhongDinhKieu.add(2020);
        arrlstKhongDinhKieu.add(2020);//Interger
        arrlstKhongDinhKieu.add(1.5);//Double
        arrlstKhongDinhKieu.add("a");
        arrlstKhongDinhKieu.add(true);
        //Khi add thêm tử kiểu dữ liệu nguyên thủy thì nó tự động chuyển sang đối tượng Wrapper
//        double temp = arrlstKhongDinhKieu.get(3);//Lỗi
//       double temp = (double) arrlstKhongDinhKieu.get(3);
//        System.out.println(temp);
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
        // Double temp = (Double) arrlstKhongDinhKieu.get(3);
        //Phương thức get dùng để lấy giá trị trong List theo index
        System.out.println(arrlstKhongDinhKieu.get(5));
        for (Object x : arrlstKhongDinhKieu) {
            System.out.println(x);
        }

        // List có định kiểu
        ArrayList<Double> arrlstCodinhKieuDouble = new ArrayList<Double>();
        arrlstCodinhKieuDouble.add(9.5);
        arrlstCodinhKieuDouble.add(7.5);
        arrlstCodinhKieuDouble.add(4.5);
        double temp = arrlstCodinhKieuDouble.get(0);
        Double temp2 = arrlstCodinhKieuDouble.get(0);
        for (Object x : arrlstCodinhKieuDouble) {
            System.out.println(x);
        }

        //Sử dụng các
        ArrayList<String> arrListName = new ArrayList<>();
        //Phương thức add dùng để chèn phần tử vào cuối của arrlist
        arrListName.add("Nam");
        arrListName.add("Anh");
        arrListName.add("Duy");
        arrListName.add("My");
        //boolean remove(Object) dùng để tìm và xóa phần tử trong ArrayList
        // arrListName.remove("Duy");
        ///boolean remove(index) dùng để tìm và xóa phần tử theo index
        //arrListName.remove(1);        
        //Clear() dùng để xóa các phần tử bên trong Arraylist
        //arrListName.clear();
        //Set Object dùng để sửa phần tử ở trong mảng theo index chỉ định
        //arrListName.set(1, "Hoang");
        //Hàm dùng để tìm ra kích thước mảng
        System.out.println("Kích thước của List là: " + arrListName.size());
        ///Lấy 1 phần tử ra khỏi List và in ra thì dùng get
        System.out.println("Phần tử tại vị trí 1 là: " + arrListName.get(1));
        //Contains dùng để kiểm tra 1 phần tử có trong danh sách hay không
        if (arrListName.contains("Duy Anh1")) {
            System.out.println("Bạn Duy Anh có trong lớp WEB");
        } else {
            System.out.println("Người bạn tìm không tồn tại trong danh sách Lớp WEb");
        }
        //Tìm vị trí của phần tử
        System.out.println("Bạn Mỹ đang đứng thứ  " + arrListName.indexOf("My"));
        //isEmpty kiểm tra
        //arrListName.clear();
        System.out.println(arrListName.isEmpty());
        //Sắp xếp sort
        Collections.sort(arrListName);
        for (Object x : arrListName) {
            System.out.print(x + " | ");
        }

        Student student1 = new Student("Dung", "JAVA1", 20);
        Student student2 = new Student("Phong1", "JAVA1", 21);
        Student student3 = new Student("Duy", "JAVA1", 18);
        Student student4 = new Student("HOA", "JAVA1", 19);
        ArrayList<Student> arrlstStudent1 = new ArrayList<Student>();
        arrlstStudent1.add(student1);
        arrlstStudent1.add(student2);
        arrlstStudent1.add(student3);//Add 1 OBJ vào list student
        ArrayList<Student> arrlstStudent2 = new ArrayList<Student>();
        arrlstStudent2.add(student4);//Add 1 OBJ vào list student
        //AddAll
        //arrlstStudent1.addAll(arrlstStudent2);
        for (Student student : arrlstStudent1) {
            System.out.println(student.getTenSV() + student.getMonSV());
        }
        //Sắp xếp có 2 cách
//        Collections.sort(arrlstStudent1);Không sử dụng được cáhc này vì không xác định được trường cần sắp xêp theo gì?
        //Collections.sort(arrlstStudent1);//Sử dụng được là vì sử dụng bên class có kể thừa hàm sắp xêp
        Collections.sort(arrlstStudent1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getTenSV().compareTo(o2.getTenSV());//săp xếp xuôi
                // return -o1.getTenSV().compareTo(o2.getTenSV());//
                if (o1.getTuoiSV() > o2.getTuoiSV()) {
                    return -1;
                } else if (o1.getTuoiSV() < o2.getTuoiSV()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Sau khi sắp xếp");
        for (Student student : arrlstStudent1) {
            System.out.println(student.getTenSV() + student.getMonSV() + student.getTuoiSV());
        }

        System.out.println("--------------");
        Student student1a = new Student("A", "JAVA1", 20);
        Student student2b = new Student("B", "JAVA1", 21);
        Student student3c = new Student("C", "JAVA1", 18);
        Student student4d = new Student("D", "JAVA1", 19);
        ArrayList<Student> arrlstStudent3 = new ArrayList<Student>();
        arrlstStudent3.add(student1a);
        arrlstStudent3.add(student2b);
        arrlstStudent3.add(student3c);
        arrlstStudent3.add(student4d);
        //sử dụng sắp xếp ngẫu nhiên các phần tử bên trong
        //Shuflte
        for (Student student : arrlstStudent3) {
            System.out.println(student.getTenSV() + student.getMonSV() + student.getTuoiSV());
        }
        //
        ArrayList<String> arrListString1 = new ArrayList<String>();
        arrListString1.add("Dũng");
        arrListString1.add("Duy Anh");
        ArrayList<String> arrListString2 = new ArrayList<String>();
        arrListString2.add("Dũng");
        arrListString2.add("Duy Anh");
        //arrListString1.addAll(arrListString2);
        arrListString1.retainAll(arrListString2);// Hiệu của 2 List chỉ giữ lại những phần tử giống nhau của 2 arrlist
        for (String x : arrListString1) {
            System.out.print(x + " | ");
        }

    }

    static void JavaMap() {
        /*
        Các phương thức của Map interface
            Phương thức	Mô tả
            void clear()	                   Gỡ bỏ tất cả cặp key/value từ Map đang gọi
            boolean containsKey(Object key)	   Trả về true nếu Map đang gọi chứa k như là một key. Nếu không là false
            boolean containsValue(Object v)	   Trả về true nếu Map đang gọi chứa v như là một value. Nếu không là false
            boolean equals(Object obj)	           Trả về true nếu obj là một Map và chứa cùng các Entry. Nếu không là false.
            Object get(Object key)	           Trả về value mà liên kết với key
            int hashCode()	                   Trả về hash code cho Map đang gọi
            boolean isEmpty()	                   Trả về true nếu Map đang gọi là trống, nếu không là false
            Object put(Object key, Object value)   Đặt một entry vào Map đang gọi, ghi đè bất kỳ value trước mà liên kết với key. Với key và value tương ứng là k và v. Trả về null nếu key đã không tồn tại. Nếu không thì, value trước mà liên kết với key được trả về
            void putAll(Map map)	           Đặt tất cả entry từ m vào trong Map này
            Object remove(Object key)	           Gỡ bỏ entry mà có khóa là key được chỉ định.
            int size()	                           Trả về số các cặp key/value trong Map
            Collection values( )	           Trả về một tập hợp chứa các value trong Map. Phương thức này cung cấp một collection-view của các value trong Map
            Set keySet()	                   Nó được sử dụng để trả đối tượng Set có chứa tất cả các keys.
            Set entrySet()	                   Nó được sử dụng để trả lại đối tượng Set có chứa tất cả các keys và values.
            Object getKey()                        Được dùng để lấy key.
            Object getValue()                      Được sử dụng để lấy value.
         */
        // Khởi tạo map với key và value
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "dungna29");//Đổ giá trị vào MAP
        map.put(2, "longntph00532");
        map.put(3, "duongpt00555");
        
        // In Map ra màn hình sử dụng phương thức method keySet()
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("---");

        // In Map ra màn hình sử dụng phương thức method entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        // Khai báo tập hợp map có key là String và giá trị là số thực
        Map<String, Double> mapDienThoai = new HashMap<String, Double>();
        // bổ sung 4 cặp phần tử vào tập hợp
        mapDienThoai.put("Nokia", 500.0);
        mapDienThoai.put("Samsung", 600.99);
        mapDienThoai.put("Motorola", 399.99);
        mapDienThoai.put("Sony Ericson", 400.50);
        // cập nhật giá trị của phẩn tử có khóa là Samsung
        mapDienThoai.put("Samsung", 555.55);
        // Chuyển đổi map sang chuỗi và xuất ra
        System.out.println(map.toString());
    }
}
