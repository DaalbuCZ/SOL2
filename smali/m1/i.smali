.class public final Lm1/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Ln1/y;",
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
            "Lo1/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/g;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lq1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;",
            "Lx8/a<",
            "Lo1/d;",
            ">;",
            "Lx8/a<",
            "Ln1/g;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/i;->a:Lx8/a;

    iput-object p2, p0, Lm1/i;->b:Lx8/a;

    iput-object p3, p0, Lm1/i;->c:Lx8/a;

    iput-object p4, p0, Lm1/i;->d:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lm1/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;",
            "Lx8/a<",
            "Lo1/d;",
            ">;",
            "Lx8/a<",
            "Ln1/g;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;)",
            "Lm1/i;"
        }
    .end annotation

    new-instance v0, Lm1/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lm1/i;-><init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lo1/d;Ln1/g;Lq1/a;)Ln1/y;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm1/h;->a(Landroid/content/Context;Lo1/d;Ln1/g;Lq1/a;)Ln1/y;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Li1/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln1/y;

    return-object p0
.end method


# virtual methods
.method public b()Ln1/y;
    .locals 4

    iget-object v0, p0, Lm1/i;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lm1/i;->b:Lx8/a;

    invoke-interface {v1}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo1/d;

    iget-object v2, p0, Lm1/i;->c:Lx8/a;

    invoke-interface {v2}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln1/g;

    iget-object v3, p0, Lm1/i;->d:Lx8/a;

    invoke-interface {v3}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq1/a;

    invoke-static {v0, v1, v2, v3}, Lm1/i;->c(Landroid/content/Context;Lo1/d;Ln1/g;Lq1/a;)Ln1/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm1/i;->b()Ln1/y;

    move-result-object v0

    return-object v0
.end method
