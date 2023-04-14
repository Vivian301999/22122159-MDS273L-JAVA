// Create a new folder in git named 'Lab 7' for the following question and solve the following: create a flowchart and document the results, constraints, etc., in the README.md file for the lab.

// Given the famous iris dataset, find the 5-point summary [Mean, Median, Mode, Min, Max] for the attributes: SepalLengthCm, SepalWidthCm, PetalLengthCm, PetalWidthCm.

// Once the overall summary statistics have been calculated, identify the summary statistics for each Species of iris flower [Iris-setosa, Iris-versicolor, Iris-virginica].

// Present your results in the appropriate format and write the results in a file.



import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class lab7{

    // public class Statistics{
    //     public static Double getMean(List<Double> data){
    //         return data.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
    //     }
    //     public static Double getMedian(List<Double> data){
    //         Collections.sort(data);
    //         int middle= data.size() / 2;
    //         return data.size() % 2 == 0? (data.get(middle-1) + data.get(middle)) / 2.0: data.get(middle);



    //     }
    //     public static Double getMode(List<Double> data){
    //         Map<Double, Integer> frequencies = new HashMap<>();
    //         for(Double value: data){
    //             frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);

    //         }
    //         Double mode= null;
    //         int maxFrequency= 0;
    //         for(Map.Entry<Double, Integer> entry : frequencies.entrySet()){
    //             if (entry.getValue() > maxFrequency){
    //                 mode = entry.getKey();
    //                 maxFrequency = entry.getValue();
    //             }

    //         }
    //         return mode;

    //     }
    //     public static Double getMin(List<Double> data){ 

    //         return Collections.min(data);
    //     }
    //     public static Double getMax(List<Double> data){
    //         return Collections.max(data);
        }
    //}
    public static void main(String[] args) {

        String csvFile = "C:/Users/vivian/Downloads/Iris.csv";
        String line = "";
        String csvSplitBy = ",";

        ArrayList<Double> sepalLengthList = new ArrayList<Double>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] iris = line.split(csvSplitBy);

                double sepalLength = Double.parseDouble(iris[0]);

                sepalLengthList.add(sepalLength);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Calculate mean
        double sum = 0;
        for (double sepalLength : sepalLengthList) {
            sum += sepalLength;
        }
        double mean = sum / sepalLengthList.size();
        System.out.println("Mean: " + mean);

        // Calculate median
        Collections.sort(sepalLengthList);
        double median;
        int middle = sepalLengthList.size() / 2;
        if (sepalLengthList.size() % 2 == 0) {
            median = (sepalLengthList.get(middle - 1) + sepalLengthList.get(middle)) / 2;
        } else {
            median = sepalLengthList.get(middle);
        }
        System.out.println("Median: " + median);

        // Calculate mode
        double mode = sepalLengthList.get(0);
        int maxCount = 0;
        for (double sepalLength : sepalLengthList) {
            int count = 0;
            for (double innerSepalLength : sepalLengthList) {
                if (innerSepalLength == sepalLength) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = sepalLength;
            }
        }
        System.out.println("Mode: " + mode);

    }
}
        //throws IOException{
    //     String csvFilePath= "C:/Users/vivian/Downloads/Iris.csv";

    //     CSVParser csvParser= CSVParser.parse(new File(csvFilePath), CSVFormat.DEFAULT.withHeader());
    //     for(CSVRecord record: csvParser){
    //         String species= record.get("Species");
    //         Double sepalLenght= Double.valueOf(record.get("SepalLengthCm"));
    //         Double sepalWidth= Double.valueOf(record.get("SepalWidthCm"));
    //         Double petalLenght= Double.valueOf(record.get("PetalLengthCm"));
    //         Double petalWidth= Double.valueOf(record.get("PetalWidthCm"));



    //     }
    // }

