.class public Lk8/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk8/n$b;
    }
.end annotation


# instance fields
.field public final a:Ll8/k;

.field private b:Lk8/n$b;

.field public final c:Ll8/k$c;


# direct methods
.method public constructor <init>(Ly7/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk8/n$a;

    invoke-direct {v0, p0}, Lk8/n$a;-><init>(Lk8/n;)V

    iput-object v0, p0, Lk8/n;->c:Ll8/k$c;

    new-instance v1, Ll8/k;

    sget-object v2, Ll8/s;->b:Ll8/s;

    const-string v3, "flutter/spellcheck"

    invoke-direct {v1, p1, v3, v2}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;Ll8/l;)V

    iput-object v1, p0, Lk8/n;->a:Ll8/k;

    invoke-virtual {v1, v0}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method static synthetic a(Lk8/n;)Lk8/n$b;
    .locals 0

    iget-object p0, p0, Lk8/n;->b:Lk8/n$b;

    return-object p0
.end method


# virtual methods
.method public b(Lk8/n$b;)V
    .locals 0

    iput-object p1, p0, Lk8/n;->b:Lk8/n$b;

    return-void
.end method
