.class public final Lh1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Lh1/k;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lh1/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;",
            "Lx8/a<",
            "Lh1/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/l;->a:Lx8/a;

    iput-object p2, p0, Lh1/l;->b:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;)Lh1/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;",
            "Lx8/a<",
            "Lh1/i;",
            ">;)",
            "Lh1/l;"
        }
    .end annotation

    new-instance v0, Lh1/l;

    invoke-direct {v0, p0, p1}, Lh1/l;-><init>(Lx8/a;Lx8/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lh1/k;
    .locals 1

    new-instance v0, Lh1/k;

    check-cast p1, Lh1/i;

    invoke-direct {v0, p0, p1}, Lh1/k;-><init>(Landroid/content/Context;Lh1/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Lh1/k;
    .locals 2

    iget-object v0, p0, Lh1/l;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lh1/l;->b:Lx8/a;

    invoke-interface {v1}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lh1/l;->c(Landroid/content/Context;Ljava/lang/Object;)Lh1/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh1/l;->b()Lh1/k;

    move-result-object v0

    return-object v0
.end method
