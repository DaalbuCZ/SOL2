.class public final Lr1/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Ls1/y;",
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
            "Lt1/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ls1/g;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lv1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;",
            "Lf9/a<",
            "Lt1/d;",
            ">;",
            "Lf9/a<",
            "Ls1/g;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/i;->a:Lf9/a;

    iput-object p2, p0, Lr1/i;->b:Lf9/a;

    iput-object p3, p0, Lr1/i;->c:Lf9/a;

    iput-object p4, p0, Lr1/i;->d:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;Lf9/a;Lf9/a;)Lr1/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;",
            "Lf9/a<",
            "Lt1/d;",
            ">;",
            "Lf9/a<",
            "Ls1/g;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;)",
            "Lr1/i;"
        }
    .end annotation

    new-instance v0, Lr1/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lr1/i;-><init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lt1/d;Ls1/g;Lv1/a;)Ls1/y;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr1/h;->a(Landroid/content/Context;Lt1/d;Ls1/g;Lv1/a;)Ls1/y;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ln1/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ls1/y;

    return-object p0
.end method


# virtual methods
.method public b()Ls1/y;
    .locals 4

    iget-object v0, p0, Lr1/i;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lr1/i;->b:Lf9/a;

    invoke-interface {v1}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt1/d;

    iget-object v2, p0, Lr1/i;->c:Lf9/a;

    invoke-interface {v2}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1/g;

    iget-object v3, p0, Lr1/i;->d:Lf9/a;

    invoke-interface {v3}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv1/a;

    invoke-static {v0, v1, v2, v3}, Lr1/i;->c(Landroid/content/Context;Lt1/d;Ls1/g;Lv1/a;)Ls1/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr1/i;->b()Ls1/y;

    move-result-object v0

    return-object v0
.end method
