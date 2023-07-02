.class public final Lm1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Lm1/i;",
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
            "Lv1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lv1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;Lf9/a;Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/j;->a:Lf9/a;

    iput-object p2, p0, Lm1/j;->b:Lf9/a;

    iput-object p3, p0, Lm1/j;->c:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;Lf9/a;)Lm1/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Landroid/content/Context;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;)",
            "Lm1/j;"
        }
    .end annotation

    new-instance v0, Lm1/j;

    invoke-direct {v0, p0, p1, p2}, Lm1/j;-><init>(Lf9/a;Lf9/a;Lf9/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lv1/a;Lv1/a;)Lm1/i;
    .locals 1

    new-instance v0, Lm1/i;

    invoke-direct {v0, p0, p1, p2}, Lm1/i;-><init>(Landroid/content/Context;Lv1/a;Lv1/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lm1/i;
    .locals 3

    iget-object v0, p0, Lm1/j;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lm1/j;->b:Lf9/a;

    invoke-interface {v1}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv1/a;

    iget-object v2, p0, Lm1/j;->c:Lf9/a;

    invoke-interface {v2}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv1/a;

    invoke-static {v0, v1, v2}, Lm1/j;->c(Landroid/content/Context;Lv1/a;Lv1/a;)Lm1/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm1/j;->b()Lm1/i;

    move-result-object v0

    return-object v0
.end method
