public class testCalc {
    public int calculate(String s) throws Exception {
        if (isEmpty(s)) {
            return  0;
        }
        if (s.length() == 1) {
            return stringtoInt(s);
        }
        else {
            String delimiter = ",";
            if(s.matches("//(.*)\n(.*)")){
                delimiter = Character.toString(s.charAt(2));
                s = s.substring(4);
            }

            String numbers[] = splitNumbers(s, delimiter + "|\n");
            return getSum(numbers);
        }
    }
    private String[] splitNumbers(String numbers, String divider){
        return numbers.split(divider);
    }
    private int getSum(String[]numbers) throws Exception {
        findWrongInput(numbers);
        int sum = 0;

        for (String current : numbers) {
            sum += stringtoInt(current);
        }
        return sum;
    }

    private void findWrongInput(String[]numbers) throws Exception {
        for (String current : numbers) {
            if (stringtoInt(current) < 0) {
                throw new Exception("Negatives not allowed" + stringtoInt(current));
            }
        }
    }
    private boolean isEmpty(String s) {
        return s.isEmpty();
    }
    private int stringtoInt(String s) {
        return Integer.parseInt(s);
    }
}
