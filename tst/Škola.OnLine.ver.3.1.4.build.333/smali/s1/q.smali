.class public final synthetic Ls1/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/b$a;


# instance fields
.field public final synthetic a:Ls1/s;

.field public final synthetic b:Ll1/p;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ls1/s;Ll1/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/q;->a:Ls1/s;

    iput-object p2, p0, Ls1/q;->b:Ll1/p;

    iput-wide p3, p0, Ls1/q;->c:J

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ls1/q;->a:Ls1/s;

    iget-object v1, p0, Ls1/q;->b:Ll1/p;

    iget-wide v2, p0, Ls1/q;->c:J

    invoke-static {v0, v1, v2, v3}, Ls1/s;->f(Ls1/s;Ll1/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
