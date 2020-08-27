package model;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 1.0 8/27/2020
 *
 * ***************************************************************************
 * OriginalScore
 * failure = 10;
 *              Number                      Equivalence class                                  Result
 *              1)                          correctCount < 0                       Incorrect/ Throws NEGATIVE_NUMBERS  Exception
 *              2)                         incorrectCount < 0                      Incorrect/ Throws NEGATIVE_NUMBERS  Exception
 *              3)                    correctCount>= 0 ^ incorrectCount=0                  Correct/  100
 *              4)              correctCount>= 0 ^  0<incorrectCount<=10                   Correct/  score - (incorrectCount*failure)
 *              5)             correctCount>= 0 ^  incorrectCount>10                       Correct/ 0
 * ***************************************************************************
 * BonusScore
 * failure = 5;
 * bonus = 10;
 *              Number                      Equivalence class                                  Result
 *               1)                          correctCount < 0                       Incorrect/ Throws NEGATIVE_NUMBERS  Exception
 *               2)                         incorrectCount < 0                      Incorrect/ Throws NEGATIVE_NUMBERS  Exception
 *               3)               incorrectCount >=0  ^ correctCount>=0                         Correct/  0
 *                                          ^    2*incorrectCount>= correctCount
 *               4)               incorrectCount >=0  ^ correctCount>=0                         Correct/  score +(correctCount*bonus - incorrectCount*failure )
 *                                           ^    incorrectCount< correctCount
 *
 * ***************************************************************************
 * PowerBonusScore
 *failure = 8;
 *bonus = 5^correctCount;
 *              Number                      Equivalence class                                  Result
 *               1)                          correctCount < 0                       Incorrect/ Throws NEGATIVE_NUMBERS  Exception
 *               2)                         incorrectCount < 0                      Incorrect/ Throws NEGATIVE_NUMBERS  Exception
 *               3)                  incorrectCount = 0 ^  correctCount>=4                         Correct/ 500
 *               4)                  incorrectCount >= 0 ^  correctCount=0                         Correct/ 0
 *               5)                                                                      Correct/  score +(sum(5^correctCount) - incorrectCount*failure )
 *
*/
public class GameScoreTest {
}
