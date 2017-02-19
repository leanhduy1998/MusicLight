package com.aadikapur.android.musiclight;

import java.util.ArrayList;
import java.util.Arrays;

public class Filter {

    private ArrayList<Double> highs;
    private ArrayList<Double> filteredHighs;

    void Filter(){
        highs = new ArrayList(
                Arrays.asList(392.17407, 392.82156, 397.39127, 398.31268, 398.06366, 368.40405, 314.32697, 253.25212, 160.94876, 249.49174, 148.65909, 229.66887, 259.3783, 253.57585, 294.1679,
                        318.78464, 284.6923, 187.52037, 205.68718, 208.58841, 210.15729, 203.28403, 165.90448, 277.6447, 235.9071, 258.0335, 256.4646, 301.04117, 293.3959, 301.6762, 292.8605, 303.7058,
                        323.317, 321.0757, 325.62054, 367.7566, 347.28622, 354.9564, 313.01956, 231.7732, 151.36105, 263.18848, 256.06616, 281.9156, 271.76758, 278.01825, 253.55095, 270.29828, 259.66467,
                        253.1774, 257.64752, 256.76343, 262.27948, 233.60356, 313.38065, 251.9198, 153.85138, 133.09464, 225.19876, 263.52466, 295.5127, 259.5526, 245.64423, 244.51112, 212.42348, 250.41315,
                        225.29837, 236.84096, 276.83536, 352.87698, 355.9525, 306.98056, 265.89044, 256.67627, 178.81673, 226.7801, 219.359, 251.79529, 247.30028, 279.71167, 305.90973, 303.4817, 326.45477,
                        314.2647, 288.19116, 278.70306, 237.10245, 267.06088, 223.74194, 210.41878, 275.27893, 299.9579, 326.46722, 320.42822, 347.42322, 328.18555, 320.06714, 328.9202, 328.3723, 348.64346,
                        351.23337, 356.214, 348.81778, 327.52563, 309.75726, 229.90546, 286.37323, 299.12363, 301.82562, 325.19717, 336.81448, 335.04636, 349.67694, 336.167, 339.25497, 355.4918, 360.6841,
                        354.50812, 354.60776, 340.9733, 301.3649, 250.77425, 286.23627, 172.35437, 203.84436, 211.93787, 198.37813, 234.30086, 303.71826, 309.91913, 237.46355, 266.25153, 261.37054,
                        292.05115, 318.06244, 306.90585, 279.15137, 261.8437, 219.58311, 157.96039, 196.77188, 212.37367, 251.5836, 332.0829, 334.46112, 301.3898, 283.16074, 326.40497, 337.32498, 346.1656,
                        346.09088, 294.80295, 31.888428, 61.672516, 171.99329, 207.35568, 220.6166, 282.82455, 319.83057, 340.43787, 326.2182, 283.8954, 246.50337, 247.4746, 240.72585, 260.58606, 253.32683
                        , 289.4363, 272.72632, 194.66756, 118.97458, 214.97604, 249.28008, 248.25903, 254.21088, 306.0467, 317.65155, 353.38748, 326.64157, 353.36258, 356.77432, 344.1858, 343.76245,
                        236.8036, 163.01573, 257.26154, 285.19034, 296.64578, 320.24146, 312.69583, 324.58704, 321.66095, 290.1834, 236.96548, 231.7732, 299.2108, 288.76395, 298.66293, 359.1899, 277.19647,
                        231.22531, 279.99805, 142.14691, 185.42851, 211.93787, 206.23506, 237.23941, 265.8531, 247.4995, 283.49695, 258.20782, 238.13594, 271.24463, 290.39508, 259.80164, 265.67877,
                        222.57149, 250.52522, 230.34126, 290.50714, 267.3971, 310.2055, 296.8948, 305.6109, 325.43378, 320.16675, 328.65872, 352.9268, 354.5206, 339.00595, 348.8925, 352.06763, 282.23932,
                        265.77838, 250.06451, 250.28864, 301.04117, 335.93042, 338.3709, 327.93652, 333.37784, 347.14926, 346.71347, 339.19272, 344.74612, 341.19742, 345.86676, 348.68082, 292.48694,
                        290.60675, 304.00464, 349.0419, 358.81638, 365.7519, 364.41956, 384.5413, 383.00974, 383.1965, 384.479, 385.23856, 385.88605, 389.94525, 395.1998, 377.65558, 316.8671, 226.44392, 92.65198, 159.86548, 194.50569, 266.6126, 276.73575, 294.77805, 259.4032, 255.89185, 274.41974, 271.68042, 296.03564, 246.95163, 328.0984, 324.12634, 192.83719, 205.28873, 168.30762, 256.37744, 292.61145, 317.98773, 348.5563, 367.07175, 354.65756, 346.75082, 344.48462, 352.34155, 371.65393, 361.15726, 369.836, 314.37677, 246.32904, 184.84329, 260.07556, 147.97424, 268.5426, 234.2635, 285.71332, 282.00275, 270.0368, 327.6875, 297.2061, 343.0029, 281.06888, 221.35124, 286.08685, 250.11432, 237.4262, 262.46625, 216.91849, 205.61247, 254.06146, 256.27783, 277.50775, 294.92746, 289.2869, 330.05328, 326.42987, 359.40158, 343.48853, 357.40933, 366.7231, 225.84625, 174.94432, 149.9914, 211.32773, 179.56383, 226.30696, 266.0025, 226.08282, 231.06345, 219.8695, 233.64091, 210.86703, 216.02197, 215.71068, 269.73798, 205.47551, 241.39824, 227.70152, 168.27026, 206.34712, 169.17923, 256.5642, 288.104, 272.46484, 256.3152, 237.40129, 224.60109, 224.78786, 260.05066, 294.40448, 274.39484, 290.38263, 305.6358, 235.14755, 252.24353, 236.43007, 199.44894, 262.61566, 266.62506, 267.48425, 238.1982, 282.92416, 266.25153, 286.75925, 280.24707, 288.7764, 291.15463, 247.76099, 259.60242, 266.96127,
                        230.36617, 229.98016));

        filteredHighs = new ArrayList<Double>();
        boolean isLargest = true;
        double max = 1;
        double min = 1000;

        for (int i = 5; i<highs.size() - 6; i++){
            isLargest = true;
            for (int j = 3; j <= 3; j++){
                if(highs.get(i-j) > highs.get(i) || highs.get(i+j) > highs.get(i))
                    isLargest = false;
            }
            if(isLargest == true){
                filteredHighs.add(highs.get(i));
                if(highs.get(i)>max)
                    max = highs.get(i);
                if (highs.get(i) < min)
                    min = highs.get(i);
            }
        }

        double range = max - min;
        double lowerThird = min + range/3;
        double higherThird = min + ((range*2)/3);
        int lowerThirdNumber = 0;
        int higherThirdNumber = 0;
        for (int i = 0; i<filteredHighs.size(); i++){
            if (filteredHighs.get(i)<lowerThird)
                lowerThirdNumber++;
            if (filteredHighs.get(i)>higherThird)
                higherThirdNumber++;
        }

        System.out.println(filteredHighs + "\nand size is: " + filteredHighs.size() + ". \nNumber of points in Lower third: " + lowerThirdNumber + "\nMiddle third: " + (filteredHighs.size() -
                lowerThirdNumber - higherThirdNumber) + "\nHigher third: " + higherThirdNumber);
    }
}