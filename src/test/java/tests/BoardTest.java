package software.ulpgc.kata4;

import org.junit.Test;
import software.ulpgc.kata6.Board;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoardTest {
    @Test
    public void should_return_empty_board_given_empty_board(){
        String state = new Board("").next().state();
        assertThat(state).isEqualTo("");
    }
    @Test
    public void should_return_board_1x1_with_a_dead_cell_given_board_1x1_with_a_dead_cell(){
        String state = new Board(".").next().state();
        assertThat(state).isEqualTo(".");
    }

    @Test
    public void should_return_board_1x1_with_a_dead_cell_given_board_1x1_with_an_dead_cell(){
        String state = new Board("X").next().state();
        assertThat(state).isEqualTo(".");
    }

    @Test
    public void should_return_board_2x2_with_all_alive_cells_given_board_2x2_with_all_alive_cells(){
    }

    public static class Cases {
        public static final String board_2x2_all_alive_cells = """
                XX
                XX
                """.trim();
        public static final String board_22_all_dead_cells = """
                ..
                ..
                """.trim();
        public static final String board_2x2_with_on_alive_cell = """
                ..
                X.
                """.trim();
        public static final String board_2x2_with_triangle_strcuture = """
                XX
                .X
                """.trim();
        public static final String board_3x3_with_all_alive_cells = """
                XXX
                XXX
                XXX
                """.trim();
        public static final String board_3x3_with_alive_cells_in_corners = """
                X.X
                ..
                X.X
                """.trim();
    }
}
