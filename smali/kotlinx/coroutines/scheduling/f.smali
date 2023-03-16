.class public Lkotlinx/coroutines/scheduling/f;
.super Lr9/g1;
.source ""


# instance fields
.field private final q:I

.field private final r:I

.field private final s:J

.field private final t:Ljava/lang/String;

.field private u:Lkotlinx/coroutines/scheduling/a;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lr9/g1;-><init>()V

    iput p1, p0, Lkotlinx/coroutines/scheduling/f;->q:I

    iput p2, p0, Lkotlinx/coroutines/scheduling/f;->r:I

    iput-wide p3, p0, Lkotlinx/coroutines/scheduling/f;->s:J

    iput-object p5, p0, Lkotlinx/coroutines/scheduling/f;->t:Ljava/lang/String;

    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/f;->Y()Lkotlinx/coroutines/scheduling/a;

    move-result-object p1

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/f;->u:Lkotlinx/coroutines/scheduling/a;

    return-void
.end method

.method private final Y()Lkotlinx/coroutines/scheduling/a;
    .locals 7

    new-instance v6, Lkotlinx/coroutines/scheduling/a;

    iget v1, p0, Lkotlinx/coroutines/scheduling/f;->q:I

    iget v2, p0, Lkotlinx/coroutines/scheduling/f;->r:I

    iget-wide v3, p0, Lkotlinx/coroutines/scheduling/f;->s:J

    iget-object v5, p0, Lkotlinx/coroutines/scheduling/f;->t:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/scheduling/a;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public final Z(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/f;->u:Lkotlinx/coroutines/scheduling/a;

    invoke-virtual {v0, p1, p2, p3}, Lkotlinx/coroutines/scheduling/a;->j(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V

    return-void
.end method

.method public b(Lb9/g;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/f;->u:Lkotlinx/coroutines/scheduling/a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/scheduling/a;->k(Lkotlinx/coroutines/scheduling/a;Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;ZILjava/lang/Object;)V

    return-void
.end method
