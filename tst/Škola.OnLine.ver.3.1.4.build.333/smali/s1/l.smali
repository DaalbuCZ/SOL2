.class public final synthetic Ls1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/b$a;


# instance fields
.field public final synthetic a:Ls1/s;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Ll1/p;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ls1/s;Ljava/lang/Iterable;Ll1/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/l;->a:Ls1/s;

    iput-object p2, p0, Ls1/l;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Ls1/l;->c:Ll1/p;

    iput-wide p4, p0, Ls1/l;->d:J

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ls1/l;->a:Ls1/s;

    iget-object v1, p0, Ls1/l;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Ls1/l;->c:Ll1/p;

    iget-wide v3, p0, Ls1/l;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Ls1/s;->e(Ls1/s;Ljava/lang/Iterable;Ll1/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
