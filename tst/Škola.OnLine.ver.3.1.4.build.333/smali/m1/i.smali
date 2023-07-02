.class Lm1/i;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lv1/a;

.field private final c:Lv1/a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lv1/a;Lv1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/i;->a:Landroid/content/Context;

    iput-object p2, p0, Lm1/i;->b:Lv1/a;

    iput-object p3, p0, Lm1/i;->c:Lv1/a;

    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lm1/h;
    .locals 3

    iget-object v0, p0, Lm1/i;->a:Landroid/content/Context;

    iget-object v1, p0, Lm1/i;->b:Lv1/a;

    iget-object v2, p0, Lm1/i;->c:Lv1/a;

    invoke-static {v0, v1, v2, p1}, Lm1/h;->a(Landroid/content/Context;Lv1/a;Lv1/a;Ljava/lang/String;)Lm1/h;

    move-result-object p1

    return-object p1
.end method
