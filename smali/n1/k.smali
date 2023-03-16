.class public final synthetic Ln1/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/b$a;


# instance fields
.field public final synthetic a:Ln1/s;

.field public final synthetic b:Lg1/p;


# direct methods
.method public synthetic constructor <init>(Ln1/s;Lg1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/k;->a:Ln1/s;

    iput-object p2, p0, Ln1/k;->b:Lg1/p;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ln1/k;->a:Ln1/s;

    iget-object v1, p0, Ln1/k;->b:Lg1/p;

    invoke-static {v0, v1}, Ln1/s;->b(Ln1/s;Lg1/p;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
