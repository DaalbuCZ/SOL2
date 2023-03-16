.class public Lx6/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly9/b;


# instance fields
.field private final a:Ly9/b;

.field private final b:Lv6/h;

.field private final c:La7/l;

.field private final d:J


# direct methods
.method public constructor <init>(Ly9/b;Lz6/k;La7/l;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/d;->a:Ly9/b;

    invoke-static {p2}, Lv6/h;->c(Lz6/k;)Lv6/h;

    move-result-object p1

    iput-object p1, p0, Lx6/d;->b:Lv6/h;

    iput-wide p4, p0, Lx6/d;->d:J

    iput-object p3, p0, Lx6/d;->c:La7/l;

    return-void
.end method
