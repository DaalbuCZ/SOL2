.class Lh1/i;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lq1/a;

.field private final c:Lq1/a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lq1/a;Lq1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/i;->a:Landroid/content/Context;

    iput-object p2, p0, Lh1/i;->b:Lq1/a;

    iput-object p3, p0, Lh1/i;->c:Lq1/a;

    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lh1/h;
    .locals 3

    iget-object v0, p0, Lh1/i;->a:Landroid/content/Context;

    iget-object v1, p0, Lh1/i;->b:Lq1/a;

    iget-object v2, p0, Lh1/i;->c:Lq1/a;

    invoke-static {v0, v1, v2, p1}, Lh1/h;->a(Landroid/content/Context;Lq1/a;Lq1/a;Ljava/lang/String;)Lh1/h;

    move-result-object p1

    return-object p1
.end method
