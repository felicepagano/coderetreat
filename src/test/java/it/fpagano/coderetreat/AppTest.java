/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.fpagano.coderetreat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static it.fpagano.coderetreat.Cell.DEAD;
import static it.fpagano.coderetreat.Cell.LIVE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class AppTest {
  @Test
  @DisplayName("Any live cell with two or three neighbors survives.")
  void anyLiveCellWithTwoOrThreeNeighborsSurvives() {
    assertThat(App.rule.apply(LIVE, 2), is(LIVE));
    assertThat(App.rule.apply(LIVE, 3), is(LIVE));
  }

  @Test
  @DisplayName("Any dead cell with three live neighbors becomes a live cell.")
  void anyDeadCellWithThreeLiveNeighborsBecomesALiveCell() {
    assertThat(App.rule.apply(DEAD, 3), is(LIVE));
  }

  @Test
  @DisplayName(
      "All other live cells die in the next generation. Similarly, all other dead cells stay dead.")
  void allOtherLiveCellsDieInTheNextGenerationSimilarlyAllOtherDeadCellsStayDead() {
    assertThat(App.rule.apply(DEAD, 0), is(DEAD));
    assertThat(App.rule.apply(DEAD, 1), is(DEAD));
    assertThat(App.rule.apply(DEAD, 4), is(DEAD));
    assertThat(App.rule.apply(LIVE, 0), is(DEAD));
    assertThat(App.rule.apply(LIVE, 1), is(DEAD));
    assertThat(App.rule.apply(LIVE, 4), is(DEAD));
  }
}
