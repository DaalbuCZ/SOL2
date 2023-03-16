.class final Lj$/util/stream/y3;
.super Lj$/util/stream/z3;

# interfaces
.implements Lj$/util/D;


# direct methods
.method constructor <init>(Lj$/util/D;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/z3;-><init>(Lj$/util/F;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/D;JJJJ)V
    .locals 11

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    invoke-direct/range {v0 .. v10}, Lj$/util/stream/z3;-><init>(Lj$/util/F;JJJJLj$/util/stream/D0;)V

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->s(Lj$/util/D;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method protected b(Lj$/util/H;JJJJ)Lj$/util/H;
    .locals 11

    move-object v1, p1

    check-cast v1, Lj$/util/D;

    .line 1
    new-instance v10, Lj$/util/stream/y3;

    move-object v0, v10

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lj$/util/stream/y3;-><init>(Lj$/util/D;JJJJ)V

    return-object v10
.end method

.method protected bridge synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lj$/util/stream/x3;->a:Lj$/util/stream/x3;

    return-object v0
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->e(Lj$/util/D;Lj$/util/function/Consumer;)V

    return-void
.end method
