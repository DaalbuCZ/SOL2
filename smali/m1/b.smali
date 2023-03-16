.class public final synthetic Lm1/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/b$a;


# instance fields
.field public final synthetic a:Lm1/c;

.field public final synthetic b:Lg1/p;

.field public final synthetic c:Lg1/i;


# direct methods
.method public synthetic constructor <init>(Lm1/c;Lg1/p;Lg1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/b;->a:Lm1/c;

    iput-object p2, p0, Lm1/b;->b:Lg1/p;

    iput-object p3, p0, Lm1/b;->c:Lg1/i;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lm1/b;->a:Lm1/c;

    iget-object v1, p0, Lm1/b;->b:Lg1/p;

    iget-object v2, p0, Lm1/b;->c:Lg1/i;

    invoke-static {v0, v1, v2}, Lm1/c;->c(Lm1/c;Lg1/p;Lg1/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
