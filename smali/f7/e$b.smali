.class Lf7/e$b;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/e;->f(Z)Lf7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf7/w<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lf7/e;


# direct methods
.method constructor <init>(Lf7/e;)V
    .locals 0

    iput-object p1, p0, Lf7/e$b;->a:Lf7/e;

    invoke-direct {p0}, Lf7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ln7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf7/e$b;->f(Ln7/a;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ln7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lf7/e$b;->g(Ln7/c;Ljava/lang/Number;)V

    return-void
.end method

.method public f(Ln7/a;)Ljava/lang/Float;
    .locals 2

    invoke-virtual {p1}, Ln7/a;->Z()Ln7/b;

    move-result-object v0

    sget-object v1, Ln7/b;->v:Ln7/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ln7/a;->S()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ln7/a;->E()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public g(Ln7/c;Ljava/lang/Number;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ln7/c;->D()Ln7/c;

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lf7/e;->d(D)V

    invoke-virtual {p1, p2}, Ln7/c;->b0(Ljava/lang/Number;)Ln7/c;

    return-void
.end method
