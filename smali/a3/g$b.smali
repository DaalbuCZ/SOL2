.class public final La3/g$b;
.super La3/g$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZZZ)V
    .locals 17

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    move/from16 v5, p5

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-wide/from16 v11, p11

    move-wide/from16 v13, p13

    move/from16 v15, p15

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, La3/g$e;-><init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZLa3/g$a;)V

    move/from16 v1, p16

    iput-boolean v1, v0, La3/g$b;->y:Z

    move/from16 v1, p17

    iput-boolean v1, v0, La3/g$b;->z:Z

    return-void
.end method


# virtual methods
.method public g(JI)La3/g$b;
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move/from16 v6, p3

    new-instance v19, La3/g$b;

    move-object/from16 v1, v19

    iget-object v2, v0, La3/g$e;->n:Ljava/lang/String;

    iget-object v3, v0, La3/g$e;->o:La3/g$d;

    iget-wide v4, v0, La3/g$e;->p:J

    iget-object v9, v0, La3/g$e;->s:Lw1/m;

    iget-object v10, v0, La3/g$e;->t:Ljava/lang/String;

    iget-object v11, v0, La3/g$e;->u:Ljava/lang/String;

    iget-wide v12, v0, La3/g$e;->v:J

    iget-wide v14, v0, La3/g$e;->w:J

    move-object/from16 p1, v1

    iget-boolean v1, v0, La3/g$e;->x:Z

    move/from16 v16, v1

    iget-boolean v1, v0, La3/g$b;->y:Z

    move/from16 v17, v1

    iget-boolean v1, v0, La3/g$b;->z:Z

    move/from16 v18, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v18}, La3/g$b;-><init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    return-object v19
.end method
