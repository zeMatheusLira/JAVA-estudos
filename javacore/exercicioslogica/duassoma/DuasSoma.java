package exercicioslogica.duassoma;

import java.util.HashMap;
import java.util.Map;
// Problemas LeetCode
public class DuasSoma {
    public int[] soma(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>(); // map para armazenar os números e seus índices

        int tamanho = nums.length; // calcula o tamanho do array

        for (int i = 0; i < tamanho; i++) { // intera sobre o array
            int diferenca = target - nums[i]; // calcula a diferença entre o alvo e o número atual

            if(numToIndex.containsKey(diferenca)) { // verifica se a diferenca está no map
                return new int[]{i, numToIndex.get(diferenca)}; // se sim ela retorna os indices
            }
            numToIndex.put(nums[i], i); // adiciona o numero atual ao map com seu indice
        }
        return null;
    }
}
