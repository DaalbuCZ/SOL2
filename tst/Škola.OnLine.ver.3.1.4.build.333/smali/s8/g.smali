.class public Ls8/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/g$b;
    }
.end annotation


# instance fields
.field public final a:Lt8/k;

.field private b:Ls8/g$b;

.field private final c:Lt8/k$c;


# direct methods
.method public constructor <init>(Lg8/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls8/g$a;

    invoke-direct {v0, p0}, Ls8/g$a;-><init>(Ls8/g;)V

    iput-object v0, p0, Ls8/g;->c:Lt8/k$c;

    new-instance v1, Lt8/k;

    sget-object v2, Lt8/s;->b:Lt8/s;

    const-string v3, "flutter/mousecursor"

    invoke-direct {v1, p1, v3, v2}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;Lt8/l;)V

    iput-object v1, p0, Ls8/g;->a:Lt8/k;

    invoke-virtual {v1, v0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method static synthetic a(Ls8/g;)Ls8/g$b;
    .locals 0

    iget-object p0, p0, Ls8/g;->b:Ls8/g$b;

    return-object p0
.end method


# virtual methods
.method public b(Ls8/g$b;)V
    .locals 0

    iput-object p1, p0, Ls8/g;->b:Ls8/g$b;

    return-void
.end method
