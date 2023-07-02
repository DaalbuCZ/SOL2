.class public final Ll1/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Ll1/u;",
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
            "Lr1/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ls1/s;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Ls1/w;",
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
            "Lr1/e;",
            ">;",
            "Lf9/a<",
            "Ls1/s;",
            ">;",
            "Lf9/a<",
            "Ls1/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/w;->a:Lf9/a;

    iput-object p2, p0, Ll1/w;->b:Lf9/a;

    iput-object p3, p0, Ll1/w;->c:Lf9/a;

    iput-object p4, p0, Ll1/w;->d:Lf9/a;

    iput-object p5, p0, Ll1/w;->e:Lf9/a;

    return-void
.end method

.method public static a(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)Ll1/w;
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
            "Lr1/e;",
            ">;",
            "Lf9/a<",
            "Ls1/s;",
            ">;",
            "Lf9/a<",
            "Ls1/w;",
            ">;)",
            "Ll1/w;"
        }
    .end annotation

    new-instance v6, Ll1/w;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ll1/w;-><init>(Lf9/a;Lf9/a;Lf9/a;Lf9/a;Lf9/a;)V

    return-object v6
.end method

.method public static c(Lv1/a;Lv1/a;Lr1/e;Ls1/s;Ls1/w;)Ll1/u;
    .locals 7

    new-instance v6, Ll1/u;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ll1/u;-><init>(Lv1/a;Lv1/a;Lr1/e;Ls1/s;Ls1/w;)V

    return-object v6
.end method


# virtual methods
.method public b()Ll1/u;
    .locals 5

    iget-object v0, p0, Ll1/w;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv1/a;

    iget-object v1, p0, Ll1/w;->b:Lf9/a;

    invoke-interface {v1}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv1/a;

    iget-object v2, p0, Ll1/w;->c:Lf9/a;

    invoke-interface {v2}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/e;

    iget-object v3, p0, Ll1/w;->d:Lf9/a;

    invoke-interface {v3}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls1/s;

    iget-object v4, p0, Ll1/w;->e:Lf9/a;

    invoke-interface {v4}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls1/w;

    invoke-static {v0, v1, v2, v3, v4}, Ll1/w;->c(Lv1/a;Lv1/a;Lr1/e;Ls1/s;Ls1/w;)Ll1/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll1/w;->b()Ll1/u;

    move-result-object v0

    return-object v0
.end method
