.class public final Lo1/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Lo1/m0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lq1/a;",
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
            "Lo1/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lo1/t0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lo1/e;",
            ">;",
            "Lx8/a<",
            "Lo1/t0;",
            ">;",
            "Lx8/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/n0;->a:Lx8/a;

    iput-object p2, p0, Lo1/n0;->b:Lx8/a;

    iput-object p3, p0, Lo1/n0;->c:Lx8/a;

    iput-object p4, p0, Lo1/n0;->d:Lx8/a;

    iput-object p5, p0, Lo1/n0;->e:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lo1/n0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lo1/e;",
            ">;",
            "Lx8/a<",
            "Lo1/t0;",
            ">;",
            "Lx8/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lo1/n0;"
        }
    .end annotation

    new-instance v6, Lo1/n0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo1/n0;-><init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V

    return-object v6
.end method

.method public static c(Lq1/a;Lq1/a;Ljava/lang/Object;Ljava/lang/Object;Lx8/a;)Lo1/m0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq1/a;",
            "Lq1/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lx8/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lo1/m0;"
        }
    .end annotation

    new-instance v6, Lo1/m0;

    move-object v3, p2

    check-cast v3, Lo1/e;

    move-object v4, p3

    check-cast v4, Lo1/t0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo1/m0;-><init>(Lq1/a;Lq1/a;Lo1/e;Lo1/t0;Lx8/a;)V

    return-object v6
.end method


# virtual methods
.method public b()Lo1/m0;
    .locals 5

    iget-object v0, p0, Lo1/n0;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/a;

    iget-object v1, p0, Lo1/n0;->b:Lx8/a;

    invoke-interface {v1}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq1/a;

    iget-object v2, p0, Lo1/n0;->c:Lx8/a;

    invoke-interface {v2}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lo1/n0;->d:Lx8/a;

    invoke-interface {v3}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lo1/n0;->e:Lx8/a;

    invoke-static {v0, v1, v2, v3, v4}, Lo1/n0;->c(Lq1/a;Lq1/a;Ljava/lang/Object;Ljava/lang/Object;Lx8/a;)Lo1/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo1/n0;->b()Lo1/m0;

    move-result-object v0

    return-object v0
.end method
