package com.chess.engine.player.ai;

import com.chess.engine.board.Board;

/**
 * Created by hx462 on 1/21/2017.
 */
public interface BoardEvaluator {

    int evaluate(Board board, int depth);

}
