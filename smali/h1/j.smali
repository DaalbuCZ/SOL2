.class public final Lh1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Lh1/i;",
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
            "Lq1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lq1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/j;->a:Lx8/a;

    iput-object p2, p0, Lh1/j;->b:Lx8/a;

    iput-object p3, p0, Lh1/j;->c:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;Lx8/a;)Lh1/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;)",
            "Lh1/j;"
        }
    .end annotation

    new-instance v0, Lh1/j;

    invoke-direct {v0, p0, p1, p2}, Lh1/j;-><init>(Lx8/a;Lx8/a;Lx8/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lq1/a;Lq1/a;)Lh1/i;
    .locals 1

    new-instance v0, Lh1/i;

    invoke-direct {v0, p0, p1, p2}, Lh1/i;-><init>(Landroid/content/Context;Lq1/a;Lq1/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lh1/i;
    .locals 3

    iget-object v0, p0, Lh1/j;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lh1/j;->b:Lx8/a;

    invoke-interface {v1}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq1/a;

    iget-object v2, p0, Lh1/j;->c:Lx8/a;

    invoke-interface {v2}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq1/a;

    invoke-static {v0, v1, v2}, Lh1/j;->c(Landroid/content/Context;Lq1/a;Lq1/a;)Lh1/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh1/j;->b()Lh1/i;

    move-result-object v0

    return-object v0
.end method
