.class Lf7/e$d;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/e;->b(Lf7/w;)Lf7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf7/w<",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lf7/w;


# direct methods
.method constructor <init>(Lf7/w;)V
    .locals 0

    iput-object p1, p0, Lf7/e$d;->a:Lf7/w;

    invoke-direct {p0}, Lf7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ln7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf7/e$d;->f(Ln7/a;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ln7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p0, p1, p2}, Lf7/e$d;->g(Ln7/c;Ljava/util/concurrent/atomic/AtomicLong;)V

    return-void
.end method

.method public f(Ln7/a;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 3

    iget-object v0, p0, Lf7/e$d;->a:Lf7/w;

    invoke-virtual {v0, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    return-object v0
.end method

.method public g(Ln7/c;Ljava/util/concurrent/atomic/AtomicLong;)V
    .locals 3

    iget-object v0, p0, Lf7/e$d;->a:Lf7/w;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    return-void
.end method
