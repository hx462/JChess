package com.chess;

import com.chess.engine.board.Board;
import com.chess.gui.Table;

/**
 * Created by hx462 on 1/17/2017.
 */
public class JChess {

    public static void main(String[] args) {

        Board board = Board.createStandardBoard();

        System.out.println(board);

        Table.get().show();

    }
}
