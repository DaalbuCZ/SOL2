.class public La3/g$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final n:Ljava/lang/String;

.field public final o:La3/g$d;

.field public final p:J

.field public final q:I

.field public final r:J

.field public final s:Lw1/m;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/String;

.field public final v:J

.field public final w:J

.field public final x:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/g$e;->n:Ljava/lang/String;

    iput-object p2, p0, La3/g$e;->o:La3/g$d;

    iput-wide p3, p0, La3/g$e;->p:J

    iput p5, p0, La3/g$e;->q:I

    iput-wide p6, p0, La3/g$e;->r:J

    iput-object p8, p0, La3/g$e;->s:Lw1/m;

    iput-object p9, p0, La3/g$e;->t:Ljava/lang/String;

    iput-object p10, p0, La3/g$e;->u:Ljava/lang/String;

    iput-wide p11, p0, La3/g$e;->v:J

    iput-wide p13, p0, La3/g$e;->w:J

    iput-boolean p15, p0, La3/g$e;->x:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZLa3/g$a;)V
    .locals 0

    invoke-direct/range {p0 .. p15}, La3/g$e;-><init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, La3/g$e;->e(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/Long;)I
    .locals 4

    iget-wide v0, p0, La3/g$e;->r:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, La3/g$e;->r:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
