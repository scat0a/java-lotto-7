package lotto.service;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import lotto.domain.Rank;

public class LottoResults {
    private final SequencedMap<Rank,Integer> lottoResults = new LinkedHashMap<>();

    public LottoResults(){
        initializeResults();
    }

    private void initializeResults(){
        for (Rank rank : Rank.values()) {
            lottoResults.put(rank,0);
        }
    }
}
