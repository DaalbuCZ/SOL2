.class public final synthetic Ln1/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/b$a;


# instance fields
.field public final synthetic a:Ln1/s;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lg1/p;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ln1/s;Ljava/lang/Iterable;Lg1/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/p;->a:Ln1/s;

    iput-object p2, p0, Ln1/p;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Ln1/p;->c:Lg1/p;

    iput-wide p4, p0, Ln1/p;->d:J

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ln1/p;->a:Ln1/s;

    iget-object v1, p0, Ln1/p;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Ln1/p;->c:Lg1/p;

    iget-wide v3, p0, Ln1/p;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Ln1/s;->e(Ln1/s;Ljava/lang/Iterable;Lg1/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
