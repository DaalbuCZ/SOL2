.class public final synthetic Ln1/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/b$a;


# instance fields
.field public final synthetic a:Ln1/s;

.field public final synthetic b:Lg1/p;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ln1/s;Lg1/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/n;->a:Ln1/s;

    iput-object p2, p0, Ln1/n;->b:Lg1/p;

    iput-wide p3, p0, Ln1/n;->c:J

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ln1/n;->a:Ln1/s;

    iget-object v1, p0, Ln1/n;->b:Lg1/p;

    iget-wide v2, p0, Ln1/n;->c:J

    invoke-static {v0, v1, v2, v3}, Ln1/s;->f(Ln1/s;Lg1/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method