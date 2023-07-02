.class Lk7/e$b;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk7/e;->f(Z)Lk7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk7/w<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lk7/e;


# direct methods
.method constructor <init>(Lk7/e;)V
    .locals 0

    iput-object p1, p0, Lk7/e$b;->a:Lk7/e;

    invoke-direct {p0}, Lk7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ls7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lk7/e$b;->f(Ls7/a;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ls7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lk7/e$b;->g(Ls7/c;Ljava/lang/Number;)V

    return-void
.end method

.method public f(Ls7/a;)Ljava/lang/Float;
    .locals 2

    invoke-virtual {p1}, Ls7/a;->Z()Ls7/b;

    move-result-object v0

    sget-object v1, Ls7/b;->v:Ls7/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ls7/a;->V()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ls7/a;->G()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public g(Ls7/c;Ljava/lang/Number;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lk7/e;->d(D)V

    invoke-virtual {p1, p2}, Ls7/c;->b0(Ljava/lang/Number;)Ls7/c;

    return-void
.end method
