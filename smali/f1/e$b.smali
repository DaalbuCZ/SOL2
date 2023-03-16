.class final Lf1/e$b;
.super Lf1/k$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lf1/k$b;

.field private b:Lf1/a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf1/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lf1/k;
    .locals 4

    new-instance v0, Lf1/e;

    iget-object v1, p0, Lf1/e$b;->a:Lf1/k$b;

    iget-object v2, p0, Lf1/e$b;->b:Lf1/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lf1/e;-><init>(Lf1/k$b;Lf1/a;Lf1/e$a;)V

    return-object v0
.end method

.method public b(Lf1/a;)Lf1/k$a;
    .locals 0

    iput-object p1, p0, Lf1/e$b;->b:Lf1/a;

    return-object p0
.end method

.method public c(Lf1/k$b;)Lf1/k$a;
    .locals 0

    iput-object p1, p0, Lf1/e$b;->a:Lf1/k$b;

    return-object p0
.end method
