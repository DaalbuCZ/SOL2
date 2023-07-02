.class public final Lt1/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Lt1/m0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lv1/a;",
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
            "Lt1/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lt1/t0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lt1/e;",
            ">;",
            "Lf9/a<",
            "Lt1/t0;",
            ">;",
            "Lf9/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/n0;->a:Lf9/a;

    iput-object p2, p0, Lt1/n0;->b:Lf9/a;

    iput-object p3, p0, Lt1/n0;->c:Lf9/a;

    iput-object p4, p0, Lt1/n0;->d:Lf9/a;

    iput-object p5, p0, Lt1/n0;->e:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)Lt1/n0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lv1/a;",
            ">;",
            "Lf9/a<",
            "Lt1/e;",
            ">;",
            "Lf9/a<",
            "Lt1/t0;",
            ">;",
            "Lf9/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lt1/n0;"
        }
    .end annotation

    new-instance v6, Lt1/n0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lt1/n0;-><init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V

    return-object v6
.end method

.method public static c(Lv1/a;Lv1/a;Ljava/lang/Object;Ljava/lang/Object;Lf9/a;)Lt1/m0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/a;",
            "Lv1/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lf9/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lt1/m0;"
        }
    .end annotation

    new-instance v6, Lt1/m0;

    move-object v3, p2

    check-cast v3, Lt1/e;

    move-object v4, p3

    check-cast v4, Lt1/t0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lt1/m0;-><init>(Lv1/a;Lv1/a;Lt1/e;Lt1/t0;Lf9/a;)V

    return-object v6
.end method


# virtual methods
.method public b()Lt1/m0;
    .locals 5

    iget-object v0, p0, Lt1/n0;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv1/a;

    iget-object v1, p0, Lt1/n0;->b:Lf9/a;

    invoke-interface {v1}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv1/a;

    iget-object v2, p0, Lt1/n0;->c:Lf9/a;

    invoke-interface {v2}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lt1/n0;->d:Lf9/a;

    invoke-interface {v3}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lt1/n0;->e:Lf9/a;

    invoke-static {v0, v1, v2, v3, v4}, Lt1/n0;->c(Lv1/a;Lv1/a;Ljava/lang/Object;Ljava/lang/Object;Lf9/a;)Lt1/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt1/n0;->b()Lt1/m0;

    move-result-object v0

    return-object v0
.end method
