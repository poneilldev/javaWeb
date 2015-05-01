/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irisdata;

import weka.classifiers.Evaluation;
import weka.core.Debug.Random;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.instance.RemovePercentage;

/**
 *
 * @author paul
 */
public class IrisData {

    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception 
     */
    public static void main(String[] args) throws Exception {
        
    String file = "/Users/paul/Desktop/BYU-Idaho/Spring2015/CS450/iris.csv";
        
    DataSource source = new DataSource(file);
    Instances data = source.getDataSet();

    if (data.classIndex() == -1){
        data.setClassIndex(data.numAttributes() - 1);
    }
    
    data.randomize(new Random(1));
    
    // set training set to 70%
    RemovePercentage remove = new RemovePercentage();
    remove.setPercentage(30);
    remove.setInputFormat(data);
    Instances trainingSet = Filter.useFilter(data, remove);
    
    // set the rest for the testing set
    remove.setInvertSelection(true);
    Instances testSet = Filter.useFilter(data, remove);
    
    // train classifier - kind of
    HardCodedClassifier classifier = new HardCodedClassifier();
    classifier.buildClassifier(trainingSet); // this does nothing right now
        
    // Evaluate classifier
    Evaluation eval = new Evaluation(trainingSet);
    eval.evaluateModel(classifier, testSet);
    //eval.crossValidateModel(classifier, data, 10, new Random(1));
      
    // Print some statistics
    System.out.println("Results: " + eval.toSummaryString());    
          
    }
    
}
