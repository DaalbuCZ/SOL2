.class public final Lm1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Lm1/k;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lm1/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;",
            "Lf9/a<",
            "Lm1/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/l;->a:Lf9/a;

    iput-object p2, p0, Lm1/l;->b:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;)Lm1/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;",
            "Lf9/a<",
            "Lm1/i;",
            ">;)",
            "Lm1/l;"
        }
    .end annotation

    new-instance v0, Lm1/l;

    invoke-direct {v0, p0, p1}, Lm1/l;-><init>(Lf9/a;Lf9/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lm1/k;
    .locals 1

    new-instance v0, Lm1/k;

    check-cast p1, Lm1/i;

    invoke-direct {v0, p0, p1}, Lm1/k;-><init>(Landroid/content/Context;Lm1/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Lm1/k;
    .locals 2

    iget-object v0, p0, Lm1/l;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lm1/l;->b:Lf9/a;

    invoke-interface {v1}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lm1/l;->c(Landroid/content/Context;Ljava/lang/Object;)Lm1/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm1/l;->b()Lm1/k;

    move-result-object v0

    return-object v0
.end method
