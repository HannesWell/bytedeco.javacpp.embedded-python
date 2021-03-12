package org.bytedeco.embeddedpython;

import java.util.Arrays;

public class NpNdarrayShort extends NpNdarray {
    private static final long serialVersionUID = 1L;
    public final short[] data;

    public NpNdarrayShort(short[] data, int[] shape, int[] strides) {
        super(shape, strides);
        if (data == null) throw new NullPointerException("data = null");
        this.data = data;
    }

    /**
     * The bytes of element.
     */
    @Override
    public int itemsize() {
        return 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NpNdarrayShort)) return false;
        if (!super.equals(o)) return false;

        NpNdarrayShort that = (NpNdarrayShort) o;

        return Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }

    public short[] toArray() {
        if (ndim() != 1) throw new RuntimeException("ndim != 1");

        if (strides[0] == 1 && data.length == shape[0]) {
            return data;
        } else {
            int[] strides = this.strides;
            short[] ary = new short[shape[0]];
            for (int i = 0; i < ary.length; i++) {
                ary[i] = data[i * strides[0]];
            }
            return ary;
        }
    }

    public short[][] toArray2d() {
        if (ndim() != 2) throw new RuntimeException("ndim != 2");

        int[] strides = this.strides;
        short[][] ary = new short[shape[0]][shape[1]];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                ary[i][j] = data[i * strides[0] + j * strides[1]];
            }
        }
        return ary;
    }

    public short[][][] toArray3d() {
        if (ndim() != 3) throw new RuntimeException("ndim != 3");

        int[] strides = this.strides;
        short[][][] ary = new short[shape[0]][shape[1]][shape[2]];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                for (int k = 0; k < ary[i][j].length; k++) {
                    ary[i][j][k] = data[i * strides[0] + j * strides[1] + k * strides[2]];
                }
            }
        }
        return ary;
    }

    public short[][][][] toArray4d() {
        if (ndim() != 4) throw new RuntimeException("ndim != 4");

        int[] strides = this.strides;
        short[][][][] ary = new short[shape[0]][shape[1]][shape[2]][shape[3]];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                for (int k = 0; k < ary[i][j].length; k++) {
                    for (int l = 0; l < ary[i][j][k].length; l++) {
                        ary[i][j][k][l] = data[i * strides[0] + j * strides[1] + k * strides[2] + l * strides[3]];
                    }
                }
            }
        }
        return ary;
    }

    public short[][][][][] toArray5d() {
        if (ndim() != 5) throw new RuntimeException("ndim != 5");

        int[] strides = this.strides;
        short[][][][][] ary = new short[shape[0]][shape[1]][shape[2]][shape[3]][shape[4]];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                for (int k = 0; k < ary[i][j].length; k++) {
                    for (int l = 0; l < ary[i][j][k].length; l++) {
                        for (int m = 0; m < ary[i][j][k][l].length; m++) {
                            ary[i][j][k][l][m] = data[i * strides[0] + j * strides[1] + k * strides[2] + l * strides[3] + m * strides[4]];
                        }
                    }
                }
            }
        }
        return ary;
    }

    public short[][][][][][] toArray6d() {
        if (ndim() != 6) throw new RuntimeException("ndim != 6");

        int[] strides = this.strides;
        short[][][][][][] ary = new short[shape[0]][shape[1]][shape[2]][shape[3]][shape[4]][shape[5]];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                for (int k = 0; k < ary[i][j].length; k++) {
                    for (int l = 0; l < ary[i][j][k].length; l++) {
                        for (int m = 0; m < ary[i][j][k][l].length; m++) {
                            for (int n = 0; n < ary[i][j][k][l][m].length; n++) {
                                ary[i][j][k][l][m][n] = data[i * strides[0] + j * strides[1] + k * strides[2] + l * strides[3] + m * strides[4] + n * strides[5]];
                            }
                        }
                    }
                }
            }
        }
        return ary;
    }

    public short[][][][][][][] toArray7d() {
        if (ndim() != 7) throw new RuntimeException("ndim != 7");

        int[] strides = this.strides;
        short[][][][][][][] ary = new short[shape[0]][shape[1]][shape[2]][shape[3]][shape[4]][shape[5]][shape[6]];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                for (int k = 0; k < ary[i][j].length; k++) {
                    for (int l = 0; l < ary[i][j][k].length; l++) {
                        for (int m = 0; m < ary[i][j][k][l].length; m++) {
                            for (int n = 0; n < ary[i][j][k][l][m].length; n++) {
                                for (int o = 0; o < ary[i][j][k][l][m][n].length; o++) {
                                    ary[i][j][k][l][m][n][o] = data[i * strides[0] + j * strides[1] + k * strides[2] + l * strides[3] + m * strides[4] + n * strides[5] + o * strides[6]];
                                }
                            }
                        }
                    }
                }
            }
        }
        return ary;
    }

    public short[][][][][][][][] toArray8d() {
        if (ndim() != 8) throw new RuntimeException("ndim != 8");

        int[] strides = this.strides;
        short[][][][][][][][] ary = new short[shape[0]][shape[1]][shape[2]][shape[3]][shape[4]][shape[5]][shape[6]][shape[7]];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                for (int k = 0; k < ary[i][j].length; k++) {
                    for (int l = 0; l < ary[i][j][k].length; l++) {
                        for (int m = 0; m < ary[i][j][k][l].length; m++) {
                            for (int n = 0; n < ary[i][j][k][l][m].length; n++) {
                                for (int o = 0; o < ary[i][j][k][l][m][n].length; o++) {
                                    for (int p = 0; p < ary[i][j][k][l][m][n][o].length; p++) {
                                        ary[i][j][k][l][m][n][o][p] = data[i * strides[0] + j * strides[1] + k * strides[2] + l * strides[3] + m * strides[4] + n * strides[5] + o * strides[6] + p * strides[7]];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return ary;
    }
}
