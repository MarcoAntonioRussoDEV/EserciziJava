import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Esercizi {
    private final static double PI_GRECO = 3.14;

    public static void main(String[] args) {
        System.out.print("1 - ");
        System.out.println(calcolaArea());
        System.out.print("2 - ");
        System.out.println(calcolaIpotenusa());
        System.out.print("3 - ");
        System.out.println(randomInterval(3, 4));
        System.out.print("4 - ");
        System.out.println(initialsFromName("Marco Russo"));
        System.out.print("5 - ");
        System.out.println(inTriangle(3, 5, 9));
        System.out.print("6 - ");
        System.out.println(collatz(10));
        System.out.print("7 - ");
        System.out.println(fooBuzz());
        System.out.print("8 - ");
        System.out.println(fibonacci(3));
        System.out.print("9 - ");
        System.out.println(isPrime(3));
        System.out.print("10 - ");
        System.out.println(contaCifreInStringa("C1ao m1 Ch14m0 M4rc0"));
        System.out.print("11 - ");
        System.out.println(listOfGreaterThan(List.of(1,2,3,4),3));
        System.out.print("12 - ");
        System.out.println(numberToHour(121));
        System.out.print("13 - ");
        System.out.println(arrayOfRandoms(10, 3, 10));
        System.out.print("14 - ");
        System.out.println(arrayToObj(new String[][] {{"nome", "Marco"},{"cognome", "Russo"}}));
        System.out.print("15 - ");
        System.out.println(frequencyOfWords("Quella cosa affianco alla cosa sulla cosa Cosa", true));
        System.out.print("16 - ");
        System.out.println(capitalize("Quella cosa affianco alla cosa sulla cosa Cosa"));
        System.out.print("17 - ");
        System.out.println(vocals("Quella cosa affianco alla cosa sulla cosa Cosa"));
        System.out.print("18 - ");
        System.out.println(slugify("Quella cosa affianco alla cosa sulla cosa Cosa"));
        System.out.print("19 - ");
        System.out.println(longestWord("Quella cosa affianco alla cosa sulla cosa Cosa"));
        System.out.print("20 - ");
        System.out.println(reduceArray(new Integer[] {1,2,4}));
        System.out.print("21 - ");
        System.out.println(binaryToBaseTen(new Byte[]{1,1,1}));
        System.out.print("22 - ");
        System.out.println(sameOccurences("xyxyxyxy"));
        System.out.print("23 - ");
        System.out.println(transformVocals("Ciao a tutti", 'o'));
        System.out.print("24 - ");
        System.out.println(arrayOfNumbers(new ArrayList<Object>(List.of(1,2,"a",4))));
        System.out.print("25 - ");
        System.out.println(reverseString("Ciao a tutti"));
        System.out.print("26 - ");
        System.out.println(deviazioneStandard( new Integer[] {8,7,9,6,5}));
        System.out.print("27 - ");
        System.out.println(sumOrAvg(new Integer[]{2,4,9}));
        System.out.println("28 - commented");
//        try {
//            System.out.println(alertEven());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.print("29 - ");
        System.out.println(reduceTo(10));
        System.out.print("30 - ");
        System.out.println(prodottoScalare(new Integer[]{1,2,3}, new Integer[]{2,5,6}));
        System.out.print("31 - ");
        System.out.println(charOccurrenciesInString("zzaaea"));
        System.out.print("32 - ");
        System.out.println(binaryReduce(42));
        System.out.print("33 - ");
        System.out.println(namesLengthEqualsTo(new String[]{"Marco", "Miriam", "Matteo", "Francesco", "Luca"}, 6));
        System.out.print("34 - ");
        System.out.println(primesTo(73));
        System.out.print("35 - ");
        System.out.println(allDivisor(10));
        System.out.print("36 - ");
        System.out.println(checkPassword("pros123"));
        System.out.print("37 - ");
        System.out.println(findIntruder(new Integer[]{1,2,7,-1,-2,3,-3}));
        System.out.print("38 - ");
        System.out.println(pwrDigit(372));
        System.out.print("39 - ");
        System.out.println(mergeArraySorted(new Integer[]{2,1}, new Integer[]{1,2,3}));
        System.out.print("40 - ");
        System.out.println(sortWordNumber("is2 thi1s t4est 3a"));
        System.out.print("41 - ");
        System.out.println(isIsogram("Casa"));
        System.out.print("42 - ");
        System.out.println(arrayDiff(new String[]{"a","b","c"}, new String[]{"b", "c", "d"}));
        System.out.print("43 - ");
        System.out.println(toChristmas());
        System.out.print("44 - ");
        System.out.println(arrayToPhone(new Integer[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.print("45 - ");
        System.out.println(intruder(new Integer[] {3,3,2,3,3,3,3,3,3}));
        System.out.print("46 - ");
        System.out.println(sfigaPerAnno(2023));
        System.out.print("46.2 - ");
        System.out.println(sfigaPerAnnoPlus(1970));
        System.out.print("47 - ");
        System.out.println(fibonacciPlus(4));
        System.out.print("48 - ");
        System.out.println(frequencyOfWordsDesc("Sopra la panca la capra campa, sotto la panca la capra crepa con la capra e l'anca."));
        System.out.print("49 - ");
        System.out.println(students(Map.of("Tizio", 5, "Caio", 3,"Marco",7,"Giuseppe",8)));
        System.out.print("50 - ");
        System.out.println(fibonacciExtreme(714));
    }

    /**
     *
     * @return Calcola l'area di un cerchio di raggio 10
     */
    public static double calcolaArea(){
        return 10*PI_GRECO;
    }

    /**
     *
     * @return Calcola l'ipotenusa di un triangolo rettangolo con i cateti di dimensione 3 e 4
     */
    public static double calcolaIpotenusa(){
        return Math.sqrt(3*3 + 4*4);
    }


    /**
     *
     * @param min Valore minimo intervallo
     * @param max Valore massimo intervallo
     * @return  Restituisce un numero casuale fra i valori (compresi) passati alla funzione
     */
    public static int randomInterval(int min, int max){
        if (min > max){
            throw new RuntimeException("Il valore minimo inserito è maggiore del valore massimo!");
        }
        return (new Random().nextInt(max-min +1) + min);
    }

    /**
     *
     * @param name Nome e Cognome separati da uno spazio
     * @return trasforma un nome nelle sue iniziali. Ad esempio: "Tizio Caio" => "T. C."
     */
    public static String initialsFromName(String name){
        String[] names = name.split(" ");

        String result = "";
        for (String s : names) {
            result += s.substring(0,1) + ". ";
        }
        result = result.replaceFirst(" $", "");
        return result;

    }

    /**
     *
     * @param a Lato 1
     * @param b Lato 2
     * @param c Lato 3
     * @return  Dati 3 lati, ritorna true se possono formare un triangolo, altrimenti false
     */
    public static Boolean inTriangle(double a, double b, double c){
        return (a+b > c && a+c > b && b+c > a);
    }

    /**
     *
     * @param num numero intero
     * @return Restituisce true se il numero è pari altrimenti false
     */
    public static Boolean isEven(int num){
        return num % 2 == 0;
    }

    /**
     *
     * @param num numero razionale
     * @return Restituisce true se il numero è pari altrimenti false
     */

    public static Boolean isEven(double num){
        return num % 2 == 0;
    }

    /**
     *
     * @param num Intero maggiore uguale a 1
     * @return preso un numero naturale maggiore di 1, se questo è pari, dividerlo per due, se dispari, moltiplicarlo per 3 e aggiungere 1. Ripetere. Qualunque sia il numero di partenza,
     *          l'algoritmo termina sempre ad 1
     */
    public static ArrayList<Integer> collatz(int num){
        if(num < 1){
            throw new RuntimeException("Il numero deve essere maggiore o uguale a 1");
        }
        ArrayList<Integer> resultArray = new ArrayList<>();

        while(num != 1){
            resultArray.add(num);
            if (isEven(num)){
                num = num / 2;
            }else{
                num = num * 3 + 1;
            }
        }
        resultArray.add(num);
        return resultArray;
    }

    /**
     *
     * @return stampa tutti i numeri da 1 a 100: per i multipli di 3 stampare FOO, per i multipli di 5 stampare BUZZ, infine per i multipli di 3 e 5 stampare FOOBUZZ
     */
    public static ArrayList<Object> fooBuzz(){
        ArrayList<Object> resultArray = new ArrayList<Object>();
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0){
                resultArray.add("FOOBUZZ");
            } else if (i % 5 == 0) {
                resultArray.add("BUZZ");
            } else if(i % 3 == 0){
                resultArray.add("FOO");
            }else {
                resultArray.add(i);
            }
        }
        return resultArray;
    }

    /**
     *
     * @param limit numero di elementi della lista di Fibonacci da visualizzare
     * @return  Restituisce la lista di Fibonacci fino all'iesimo elemento
     */
    public static List<Integer> fibonacci(int limit){
        List<Integer> resultArray = new ArrayList<Integer>(List.of(1, 1));
        if(limit < 1){
            throw new RuntimeException("il limite deve essere maggiore di 0");
        } else if (limit < 3) {
            resultArray =  resultArray.subList(0, limit);
        }else{
            for (int i = 1; i <  limit -1 ; i++) {
                resultArray.add(resultArray.get(i) + resultArray.get(i-1));
            }
        }
        return resultArray;
    }

    /**
     *
     * @param num intero da valutare
     * @return Restituisce true se il numero passato è primo altrimenti false
     */
    public static Boolean isPrime(int num){
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                resultList.add(i);
            }
        }

        return resultList.size() == 2;
    }

    /**
     *
     * @param str Stringa da esaminare
     * @return funzione che, assegnata una stringa, ritorna la somma delle cifre in essa presenti
     */
    public static Integer contaCifreInStringa(String str){
        List<Integer> result = new ArrayList<Integer>();

        char[] caratteri = str.toCharArray();
        for (char c : caratteri) {
            if (Character.isDigit(c)){
                result.add(Character.getNumericValue(c));
            }
        }

    return result.stream().reduce(0, (a,b) -> a + b);
    }

    /**
     *
     * @param list Lista di elementi da esaminare
     * @param limit Valore massimo entro il quale gli elementi devono essere rimossi dalla lista iniziale
     * @return restituisce una lista formata dai numeri maggiori della soglia fornita
     */
    public static List<Integer> listOfGreaterThan(List<Integer> list, Integer limit){
        List<Integer> result = new ArrayList<Integer>();
        for (Integer i : list) {
            if (i > limit){
                result.add(i);
            }
        }

        return result;
    }


    /**
     *
     * @param num numero di minuti
     * @return  trasforma un numero in ore e minuti: ad esempio 3014 => 50:14
     */
    public static String numberToHour(Integer num){
        Integer hours = num / 60;
        Integer minutes = num % 60;
        List<String> result = new ArrayList<String>();
        List<Integer> integerList = new ArrayList<Integer>(List.of(hours, minutes));

        integerList.forEach(el ->{
           result.add(el < 10 ? "0"+el : String.valueOf(el));
        });

        return String.join(":",result);
    }

    /**
     *
     * @param limit numero di elementi da generare
     * @param min   minimo numero compreso dell'intervallo
     * @param max   massimo numero compreso dell'intervallo
     * @return  Restituisce una lista di N numeri interi casuali fra l'intervallo indicato
     */
    public static List<Integer> arrayOfRandoms(int limit,int min, int max){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            result.add(randomInterval(min, max));
        }
        return result;
    }

    /**
     *
     * @param list Array multidimensionale chiave - valore
     * @return trasforma un array di array in una Map
     */
    public static Map<String, String> arrayToObj(String[][] list){
        Map<String, String> map = new HashMap<String, String>();
        for (String[] subArray : list) {
                map.put(subArray[0], subArray[1]);
        }
        return map;

    }

    /**
     *
     * @param str Stringa sulal quale effettuare le operazioni di verifica
     * @param CASE_INSENSITIVE Flag booleano per controllare le parole considerando le maiuscole
     * @return  assegnata una stringa, ritorna un oggetto con chiavi le parole (distinte) e valori la loro frequenza.
     */
    public static Map<String, Integer> frequencyOfWords(String str, Boolean CASE_INSENSITIVE){
        if (CASE_INSENSITIVE){
            str = str.toLowerCase();
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>(List.of(str.split(" ")));
        Set<String> set = new HashSet<String>(list);

        set.forEach(key ->{
            AtomicInteger counter = new AtomicInteger();
            list.forEach(value ->{
                if(Objects.equals(key, value)){
                    counter.getAndIncrement();

                }
                map.put(key, counter.get());
            });
        });
        return map;
    }

    /**
     *
     * @param str Stringa passata alla funzione
     * @return  Data una stringa, restituisce la stessa con tutte le parole con le lettere maiuscole
     */
    public static String capitalize(String str){
        List<String> list = new ArrayList<String>(List.of(str.split(" ")));
        List<String> resultList = new ArrayList<String>();
        list.forEach(word ->{
           resultList.add(word.replaceFirst("[a-zA-Z]", String.valueOf(word.charAt(0)).toUpperCase()));
        });
        return String.join(" ", resultList);
    }

    /**
     *
     * @param str Stringa passata alla funzione
     * @return  Data una stringa restituisce il numero di vocali presenti (Case Insensitive)
     */
    public static Integer vocals(String str){
        List<Character> vocals = new ArrayList<Character>(List.of('a','e','i','o','u'));
        Integer counter = 0;
        char[] chars = str.toLowerCase().toCharArray();

        for (char c : chars) {
            if (vocals.contains((Character) c)){
                    counter++;
            }
        }

        return counter;
    }

    /**
     *
     * @param str Stringa passata alla funzione
     * @return Assegnata una stringa ne restituisce la versione in slug (parola-parola2-parola3)
     */
    public static String slugify(String str){
        return str.replaceAll(" ", "-");
    }

    /**
     *
     * @param str Stringa passata alla funzione
     * @return funzione che accetta una stringa e  restituisce la parola più lunga
     */
    public static String longestWord(String str){
        List<String> list = new ArrayList<String>(List.of(str.toLowerCase().replaceAll("[^a-zA-Z ]","").split(" ")));
        Set<String> set = new HashSet<String>(list);
        AtomicReference<String> longest = new AtomicReference<>(list.getFirst());
        set.forEach(word->{
            if (word.length() > longest.get().length()){
                longest.set(word);
            }
        });
        return longest.toString();
    }

    /**
     *
     * @param arr Array di interi passato alla funzione
     * @return dato un array, ritorna "pari" o "dispari" a seconda che la somma dei suoi elementi sia pari o dispari
     */
    public static String reduceArray(Integer[] arr){
        Integer sum = Arrays.stream(arr).reduce( 0,(a,b) -> a+b);
        return sum % 2 == 0 ? "pari" : "dispari";
    }

    /**
     *
     * @param binaryCode Array di 0 e 1
     * @return  Restituisce un intero convertito in base 10
     */
    public static Integer binaryToBaseTen(Byte[] binaryCode){
        Integer counter = 0;
        List<Byte> list = Arrays.stream(binaryCode).toList().reversed();
        for (int i = 0; i < binaryCode.length; i++) {
            counter += (int) (list.get(i) * Math.pow(2, i));
        }
        return counter;
    }

    /**
     *
     * @param str Stringa di soli due caratteri
     * @return  ritorna se il numero di x e y è uguale. Ad esemio, "xxoxoo" => true
     */
    public static Boolean sameOccurences(String str){
        List<String> chars = new ArrayList<>(List.of(str.split( "")));
        List<String> list1 = new ArrayList<String>();
        list1.add(chars.getFirst());
        List<String> list2 = new ArrayList<String>();

        chars.forEach(c ->{
            if(list1.contains(c)){
                list1.add(c);
            }else {
                list2.add(c);
            }
        });

        return list1.size() -1 == list2.size();
    }

    /**
     *
     * @param str Stringa passata al metodo
     * @param vocal Vocale con cui sovrascrivere
     * @return  Restituisce la stringa con tutte le vocali sovrascritte con la vocale data
     */
    public static String transformVocals(String str, String vocal){
        return str.replaceAll("[aeiou]", vocal);
    }

    /**
     *
     * @param str Stringa passata al metodo
     * @param vocal Vocale con cui sovrascrivere
     * @return  Restituisce la stringa con tutte le vocali sovrascritte con la vocale data
     */
    public static String transformVocals(String str, char vocal){
        return str.replaceAll("[aeiou]", String.valueOf(vocal));
    }

    /**
     *
     * @param list Lista di tipi misti
     * @return  Restituisce una lista di soli interi presenti nella lista originale
     */
    public static List<Integer> arrayOfNumbers(List<Object> list){
        List<Integer> integerList = new ArrayList<Integer>();
        list.forEach(el ->{
           if(el.getClass().getSimpleName().equals("Integer")){
                integerList.add((Integer) el);
            }


        });
        return integerList;
    }

    /**
     *
     * @param str Stringa in ingresso
     * @return  La stringa al contrario
     */
    public static String reverseString(String str){
        String[] chars = str.split("");
        List<String> list  = Arrays.stream(chars).toList().reversed();
        return String.join("", list);
    }

    /**
     *
     * @param arr Array di interi
     * @return  Restituisce la media degli elementi dell'array
     */
    public static Double average(Integer[] arr){
        Integer redx =  Arrays.stream(arr).reduce(0,(a,b)->a+b);
        return (double) redx/arr.length;
    }

    /**
     *
     * @param arr Array di interi
     * @return Restituisce la deviazione standard degli elementi dell'array
     * @see Esercizi#average(Integer[])
     */
    public static Double deviazioneStandard(Integer[] arr){
        double avg = average(arr);
        List<Double> list = new ArrayList<>();
        for (Integer i : arr) {
            list.add(Math.pow(i - avg, 2));
        }

        return Math.sqrt(list.stream().reduce((double) 0,(a, b) -> a+b) / arr.length);
    }

    /**
     *
     * @param arr Array di interi
     * @return accetta in ingresso un array di numeri, ritorna la somma se questa è pari, altrimenti la media
     */
    public static Double sumOrAvg(Integer[] arr){
        Integer sum = Arrays.stream(arr).reduce(0, (a,b) -> a+b);
        return isEven(sum)?sum:average(arr);
    }

    /**
     *
     * @return Legge in input un numero e lancia un alert avvisando se è dispari o pari
     */
    public static Exception alertEven() throws IOException {
        int a = System.in.read();
        if(isEven(a)){
            return new Exception("il numero è pari");
        }else{
            return new Exception("il numero è dispari");
        }
    }

    /**
     *
     * @param a intero
     * @return  assegnato un numero naturale ritorna la somma da uno fino al numero assegnato
     */
    public static Integer reduceTo(int a){
        int count = 0;
        for (int i = 1; i <= a; i++) {
            count += i;
        }
        return count;
    }

    /**
     *
     * @param arr1  array di interi
     * @param arr2  array di interi
     * @return  Restituisce il prodotto scalare di 2 array
     */
    public static Integer prodottoScalare(Integer[] arr1, Integer[] arr2){
        if(arr1.length != arr2.length){
            throw new RuntimeException("Gli array devono avere la stessa dimensione");
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            arr.add(arr1[i] * arr2[i]);
        }
        return arr.stream().reduce(0, (a,b) -> a+b);
    }

    /**
     *
     * @param str stringa
     * @return ritorna una Map con chiave il carattere e valore il numero di volte che compare nella stringa. Ad esempio "casa" => {"a"; 2,"c":1, "s":1} in ordine alfabetico
     */
    public static Map<String, Integer> charOccurrenciesInString(String str){
        Map<String, Integer> mapResult = new TreeMap<>();
        List<String> list = new ArrayList<>(List.of(str.split("")));
        list.forEach(el -> {
            if(mapResult.containsKey(el)){
                mapResult.replace(el, mapResult.get(el) + 1);
            }else{
                mapResult.put(el, 1);
            }
        });
        return mapResult;
    }

    /**
     *
     * @param a intero
     * @return ritorna il numero di bit uguali ad 1 nella sua rappresentazione binaria, ad esempio: 42 in binario 101010 => 3
     */
    public static Integer binaryReduce(int a){
        List<Integer> list = new ArrayList<>();
        while(a > 0){
            list.add(a%2);
            a /= 2;
        }
        return list.stream().reduce(0, (x,y) ->x+y);
    }

    /**
     *
     * @param names Array di stringhe
     * @param limit lunghezza delle stringhe da conservare
     * @return ritorna un nuovo array contenente solo i nomi di lunghezza uguale al numero assegnato, in ordine alfabetico
     */
    public static List<String> namesLengthEqualsTo(String[] names, int limit){
        TreeSet<String> orederedList = new TreeSet<>();
        for (String name : names) {
            if(name.length() == limit){
                orederedList.add(name);
            }
        }
        List<String> list = new ArrayList<>(orederedList);
        return list;
    }

    /**
     *
     * @param a intero
     * @return ritorna tutti i numeri primi esistenti fino al numero assegnato compreso
     */
    public static List<Integer> primesTo(int a){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    /**
     *
     * @param a intero
     * @return Restituisce tutti i divisori del numero dato
     */
    public static List<Integer> allDivisor(int a){
        List<Integer> list = new ArrayList<>();
        if (isPrime(a)){
            return new ArrayList<>(List.of(1,a));
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                list.add(i);
            }
        }
        return list;
    }

    /**
     *
     * @param password stringa
     * @return accetta in ingresso una stringa (una password) e ritorna true/false se è valida,per essere valida, la password deve essere lunga almeno 6 caratteri e deve contenere almeno un numero. Nella password non devono esserci caratteri ripetuti
     */
    public static Boolean checkPassword(String password){
        Set<String> set = new HashSet<>(List.of(password.split("")));
        String uniqueCharPassword = String.join("",set);
        boolean noRepeat = uniqueCharPassword.length() == password.length();
        boolean minChatLength = password.length() >= 6;
        boolean atLeastOneNumber = Pattern.compile("\\d").matcher(password).find();
        if (noRepeat && minChatLength && atLeastOneNumber){
            return true;
        }

        return false;
    }

    /**
     *
     * @param arr Array di interi
     * @return Dato un array di numeri interi in cui sono presenti in posizioni random un numero ed il suo opposto tranne che per 1 elemento. ritorna tale elemento. Ad esempio [-3,1,2,3,-1,4,-2] => 4
     */
    public static Integer findIntruder(Integer[] arr){
        return (Integer) Arrays.stream(arr).reduce(0, (a,b)->a+b);
    }

    /**
     *
     * @param a
     * @return accetta in ingresso un numero e ritorna un numero formato dai quadrati di ogni cifra presente in ingresso. Ad esempio 372 => 9494.
     */
    public static Integer pwrDigit(Integer a){
        List<String> str = new ArrayList<>(List.of(a.toString().split("")));
        List<Integer> list = str.stream().mapToInt(digit -> Integer.parseInt(digit)*Integer.parseInt(digit)).boxed().collect(Collectors.toList());
        AtomicReference<String> stringa = new AtomicReference<>("");
        list.forEach(el ->{
            stringa.updateAndGet(v -> v + el);
        });
        return Integer.parseInt(String.valueOf(stringa));

    }

    /**
     *
     * @param arr1  Array di interi
     * @param arr2  Array di interi
     * @return funzione che unisca due array di numeri, ordinandoli in modo decrescente ed eliminando i duplicati. Ad esempio [2,1] [1,2,3] => [3,2,1]
     */
    public static List<Integer> mergeArraySorted(Integer[] arr1, Integer[] arr2){
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        Collections.addAll(set, arr1);
        Collections.addAll(set, arr2);
        return new ArrayList<Integer>(set);
    }

    /**
     *
     * @param str Stringa con un numero per parola
     * @return ritorna la stringa ordinata in base al numero presente in ogni parola. Ad esempio "is2 thi1s t4est 3a" => "Thi1s is2 3a t4est"
     */

    public static String sortWordNumber(String str){
        List<String> list = new ArrayList<>(List.of(str.toLowerCase().split(" ")));
        List<Character> listChar = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            listChar.add(c);
        }
        listChar = listChar.stream().filter(Character::isDigit).toList();
        TreeSet<Character> set = new TreeSet<>(listChar);
        List<String> result = new ArrayList<>();
        for (Character c : set) {
            for (String word : list) {
                if (word.contains(c.toString())){
                    result.add(word);
                }
            }
        }

        return String.join(" ", result);
    }

    /**
     *
     * @param str stringa
     * @return determini se una stringa è un isogramma case insensitive
     */
    public static Boolean isIsogram(String str){
        String uniqStr = String.join("", new TreeSet<String>(List.of(str.split(""))));

        return str.length() == uniqStr.length();
    }

    /**
     *
     * @param arr1 Array
     * @param arr2 Array
     * @return ritorna la differenza di array, ovvero il primo array privo degli elementi presenti nel secondo array
     */
    public static List arrayDiff(String[] arr1, String[] arr2){
        List<String> listArr1 = Arrays.asList(arr1);
        List<String> listArr2 = Arrays.asList(arr2);
        List<String> result = new ArrayList<>();
            for (String i : listArr1) {
                if (!listArr2.contains(i)) {
                    result.add(i);
                }
            }
        return result;

    }

    /**
     *
     * @return Restituisce i giorni restanti fino a Natale
     */
    public static Integer toChristmas(){
        Calendar calendar = new GregorianCalendar();
        Calendar christmas = new GregorianCalendar(Calendar.YEAR,11, 25);

        Integer result = christmas.get(Calendar.DAY_OF_YEAR) - calendar.get(Calendar.DAY_OF_YEAR);
        return result;
    }

    /**
     *
     * @param arr Array di 10 numeri
     * @return restituisca una stringa formattata come un numero di telefono, ad esempio [1,2,3,4,5,6,7,8,9,0] => "(123) 456-7890"
     */
    public static String arrayToPhone(Integer[] arr){
        StringBuilder result = new StringBuilder("");
        result.append(Arrays.stream(arr, 0, 3).map(String::valueOf).collect(Collectors.joining("","(",") ")))
              .append(Arrays.stream(arr,3,6).map(String::valueOf).collect(Collectors.joining("")))
              .append(Arrays.stream(arr,6,arr.length).map(String::valueOf).collect(Collectors.joining("","-","")));

        return result.toString();
    }

    /**
     *
     * @param arr array di numeri interi tutti uguali tranne uno
     * @return ritorni l'estraneo
     */
    public static Integer intruder(Integer[] arr){
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Set<Integer> set = new HashSet<>(list);
        List<Integer> uniq = new ArrayList<>(set);
        Integer counter = 0;

        for (Integer el : list) {
            if (uniq.getFirst() == el){
                counter++;
            }
        }

        if(counter == 1){
            return uniq.getFirst();
        }
        return uniq.getLast();
    }

    /**
     *
     * @param year anno da controllare come numero intero
     * @return  Restituisce una lista di date di venerd' 17
     */
    public static List<String> sfigaPerAnno(Integer year){
        List<String> result = new ArrayList<>();
        Calendar calendar = new GregorianCalendar();
            for (int month = 0; month < 12; month++) {
            calendar.set(year,month, 17 );
                if(calendar.get(Calendar.DAY_OF_WEEK) == 6 && calendar.get(Calendar.DAY_OF_MONTH) == 17){
                    result.add(new SimpleDateFormat("E dd MMMMM yyyy").format(new GregorianCalendar(year,month, 17).getTime()));
                }
            }
        return result;
    }

    /**
     * 
     * @param year Anno di partenza
     * @return Restituisce una lista di tutti gli anni con il maggior numero di venerdì 17 
     * @see Esercizi#sfigaPerAnno(Integer)
     */
    public static Map<Integer, Integer> sfigaPerAnnoPlus(Integer year){
        Calendar now = new GregorianCalendar();
        Map<Integer, Integer> listOfUnluckyYears = new HashMap<>();
        List<String> mostUnluckyYear = new ArrayList<>();
        
        for (int y = year; y <= now.get(Calendar.YEAR); y++) {
            Integer numOf17 = sfigaPerAnno(y).size();
            if(mostUnluckyYear.size() <= numOf17){
                mostUnluckyYear = sfigaPerAnno(y);
                if(!listOfUnluckyYears.containsKey(y)){
                    listOfUnluckyYears.put(y,sfigaPerAnno(y).size());
                }
            }

        }
        
        List<String> finalMostUnluckyYear = mostUnluckyYear;
        return new HashMap<>(listOfUnluckyYears.entrySet()
                                               .stream()
                                               .filter(el -> el.getValue() == finalMostUnluckyYear.size())
                                               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    /**
     *
     * @param num numero di elementi serie di fibonacci
     * @return accetta come parametro un numero N e
     *         1.) genera la sequenza di fibonacci di lunghezza N,
     *         2.) calcola il rapporto fra i due termini consecutivi della stessa (i rapporti approssimano la sezione aurea, e li stampa in console),
     *         3.) stampa un array con le differenze fra termini consecutivi dei rapporti
     */
    public static List<Double> fibonacciPlus(int num){
        List<Integer> fibonacci = new ArrayList<>(fibonacci(num));
        List<Double> rapporti = new ArrayList<>();

        for (int i = 0; i < fibonacci.size(); i++) {
                if(fibonacci.getLast() != fibonacci.get(i)){
                    Double rapporto = Double.valueOf(fibonacci.get(i+1)) / Double.valueOf(fibonacci.get(i));
                    rapporti.add(rapporto);
                }

        }
        List<Double> differenze = new ArrayList<>();
        for (int i = 0; i < rapporti.size(); i++) {
            if(rapporti.getLast() != rapporti.get(i)){
                Double differenza = Double.valueOf(rapporti.get(i+1)) - Double.valueOf(rapporti.get(i));
                differenze.add(differenza);
            }
        }
        return differenze;
    }

    /**
     *
     * @param str Stringa
     * @return assegnata una stringa, restituisce un oggetto {"parola": frequenza},
     *         ordinato per frequenza decrescente.
     *         Prima di processare la stringa, la ripulisce da parole inutili (articoli, preposizioni,...) e punteggiatura
     */

    public static Map<String,Integer> frequencyOfWordsDesc(String str){
        List<String> toRemove = Arrays.asList("di", "a" , "da", "in","con","su","per","tra","fra","e","che","il", "lo", "la","i","gli","le");
        str = str.replace("l'", "").replaceAll("[,.!?_;:]", "");
        List<String> words = Arrays.asList(str.split(" "));
        words = words.stream().filter(el -> !toRemove.contains(el)).toList();
        Map<String, Integer> map = frequencyOfWords(String.join(" ",words), true);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    /**
     *
     * @param map Map&ld;String,Integer> di studenti e voti {"Tizio": 5, "Caio": 3}
     * @return Ritorna un Map con chiave il nome dello studente, e con valore "Promosso con NN" o "Bocciato con NN",
     *         dove NN è il voto dello studente presente nell'oggetto in entrata, a seconda che NN sia maggiore-uguale o minore della media modificata
     */
    public static Map<String,String> students(Map<String,Integer> map){
        Integer avg = (int) Math.floor(Double.valueOf(map.values().stream().reduce((a, b) -> a+b).get()) / map.size() * 1.1);
        Map<String,String> result = new HashMap<>();
        for (Map.Entry<String, Integer> el : map.entrySet()) {
            result.put(el.getKey(), (el.getValue() >= avg? "Promosso con " : "Bocciato con ") + el.getValue());
        }
        System.out.print("La media è " + avg + " ");
        return result;
    }

    /**
     * 
     * @param limit numero massimo di elementi della serie da ottenere
     * @return Restituisce una List di interi il quale elemento più grande non può superare il numero passato in ingresso
     * @see Esercizi#fibonacci(int) 
     * @see Esercizi#fibonacciExtreme(int)
     */
    public static List<Integer> fibonacciForExtreme(int limit){
        List<Integer> resultArray = new ArrayList<Integer>(List.of(1, 1));
        if(limit < 1){
            throw new RuntimeException("il limite deve essere maggiore di 0");
        } else if (limit < 3) {
            resultArray =  resultArray.subList(0, limit);
        }else{
            for (int i = 1; (resultArray.get(i - 1) * resultArray.get(i)) <  limit -1 ; i++) {
                resultArray.add(resultArray.get(i) + resultArray.get(i-1));
            }
        }
        return resultArray;
    }

    /**
     *
     * @param product prodotto sul quale effettuare la ricerca
     * @return cerca due elementi nella successione di fibonacci tali che il loro prodotto sia pari a prod.
     *        Se tali elementi esistono, la funzione deve ritornare [F(n), F(n+1), true], altrimenti deve ritornare [F(n), F(n+1), false],
     *        dove F(m) è il più piccolo numero di Fibonacci per cui F(m) * F(m+1) > prod. Ad Esempio: productFib(714) => (21,34,true), productFib(800) => (34,55,false).
     */
    public static List fibonacciExtreme(int product){
        List<Integer> fibonacci = fibonacciForExtreme(product);
        List result = new ArrayList<>();
        for (int i = 0; i < fibonacci.size(); i++) {
            if (!Objects.equals(fibonacci.getLast(), fibonacci.get(i))){
                Integer prod = fibonacci.get(i) * fibonacci.get(i+1);
                if (prod == product){
                    result.add(fibonacci.get(i));
                    result.add(fibonacci.get(i+1));
                    result.add(true);

                } else if (prod > product) {
                    result.add(fibonacci.get(i));
                    result.add(fibonacci.get(i+1));
                    result.add(false);
                }
            }
        }

        return result;
    }


}
